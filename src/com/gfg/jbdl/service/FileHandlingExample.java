package com.gfg.jbdl.service;

import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class FileHandlingExample {



    // The different ways to read the file. and Files class with the stream of lines acts like a supplier and read the files.

     /*If we try to write to a file that doesn’t exist, the file will be created first and no exception will be thrown (except using Path method).
            Always close the output stream after writing the file content to release all resources. It will also help in not corrupting the file.
            Use PrintWriter is used to write formatted text.
            Use FileOutputStream to write binary data.
            Use DataOutputStream to write primitive data types.
            Use FileChannel to write larger files. It is the preferred way of writing files in Java 8 as well.*/


    public static void main(String[] args) throws IOException {

//        BufferedReader reader=new BufferedReader(new FileReader(new File("fileData.txt")));
//        while(reader.lines()!=null){
//            reader.readLine();
//        }

        // reading files
//        System.out.println( new File(".").getAbsolutePath());
//        Stream<String> lines = Files.lines(Path.of("fileData.txt"));
//        lines.forEach(System.out::println);

        BufferedReader br = Files.newBufferedReader(Paths.get("fileData.txt"));
        Stream<String> lines1 = br.lines().filter(line -> line.contains("hi"));
        lines1.forEach(System.out::println);

        List<String> strList = Files
                .readAllLines(Path.of("fileData.txt"));
        Stream<String> lines2 = strList.stream();
        lines2.forEach(System.out::println);

        // try with resource takes auto closeable resource and makes sure the resource is closed as a try blocks finishes or exception.



        try (Stream<String> lines3 = Files
                .lines(Path.of("fileData.txt"))) {
            lines3.forEach(System.out::println);
        }

        try (Stream<String> lines4 =
                     (Files.newBufferedReader(Paths.get("fileData.txt"))
                             .lines())) {
            lines4.forEach(System.out::println);
        }

        //for the large files we use the File channel to allocate the seprate buffer memory and read the file chunk by chunk
        // ByteBuffer is the class which will  be used to allocate the memory and methods like flip(), rewind(), reset() are used for using the same memory again.



        Path fileName = Path.of("fileData.txt");
        String content  = "hello world !!";

        try (
                RandomAccessFile stream = new RandomAccessFile(fileName.toFile(),"rw");
                FileChannel channel = stream.getChannel();) {

             byte[] strBytes = content.getBytes();

   //       ByteBuffer buffer = ByteBuffer.allocate(strBytes.length);
            ByteBuffer buffer = ByteBuffer.allocate(10000000);


            buffer.put(strBytes);
            buffer.flip();
            channel.write(buffer);
        }



        // file writing with datastream. The importance of using datastream is it lets you read the primitive types in file and read as same.

        DataOutputStream dataoutput=new DataOutputStream(new FileOutputStream(new File("test.txt")));
        dataoutput.writeUTF("hello");
        dataoutput.writeInt(10);
        dataoutput.writeLong(50);

        DataInputStream dataInput=new DataInputStream(new FileInputStream(new File("test.txt")));

        if(dataInput.available() >0){
            String name=dataInput.readUTF();

            Long number=dataInput.readLong();
            int n=dataInput.readInt();

            System.out.println(name+" "+number+" "+n);
        }

    }


}
