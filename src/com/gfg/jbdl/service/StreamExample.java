package com.gfg.jbdl.service;

import com.gfg.jbdl.domain.Trade;

import java.io.ObjectStreamException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        TradesDAO tradesDAO=new TradesDAO();

        List<Trade> trades=tradesDAO.getLastYearTrades();
/*

        using filter in streams
        for(Trade trade:trades)
        {
            if(trade.getSymbol().equals("TCS")) {
                System.out.println(trade);
            }
        }

        trades.stream().filter(trade -> trade.getSymbol().equals("TCS") ||  trade -> trade.getSymbol().equals("WIPRO")).forEach(trade ->  {
            System.out.println(trade);
        });
        // it accepts only one predicate

         trades.stream().filter(trade -> (trade.getSymbol().equals("TCS")  ||  trade.getSymbol().equals("WIPRO"))).forEach(trade ->  {
            System.out.println(trade);
        });
        trades.stream().filter(trade -> trade.getSymbol().equals("TCS")).forEach(System.out::println);*/
//

      //  numbersList.add(10L);

       // List<Trade> secondSourceList=trades.stream().filter(trade -> (trade.getSymbol().equals("TCS"))).collect(Collectors.toList());
        //the above from second source of data

        /*
        * filter the trades from 1st source to 2nd source
        *
        * List<Trade> filteredTrade=trades.stream().filter(trade ->secondSourceList.contains(trade)).collect(Collectors.toList());
        * */


       /*

       grouping example:
       It lets you group the collection(list,set..) into the map with specific attribute as key.

       Map<String,List<Trade>> myTradeMap=new HashMap<>();

        for(Trade trade:trades){
//            if(!myTradeMap.containsKey(trade.getSymbol())) {
//                myTradeMap.put(trade.getSymbol(),new ArrayList<>());
//            }
//                myTradeMap.get(trade.getSymbol()).add(trade);

            List<Trade> trades1=myTradeMap.getOrDefault(trade.getSymbol(),new ArrayList<>());
            trades1.add(trade);
            myTradeMap.put(trade.getSymbol(),trades1);
        }

        Map<String,List<Trade>> myTradeMapFromStream=trades.stream().collect(Collectors.groupingBy(Trade::getSymbol));


        * <TCS,[{tcs1,tcs2}]>
           <Wipro,[{wipro1}]


*/
/*

        Map example:


        List<String> symbols=new ArrayList<>();
        for(Trade trade:trades){
            symbols.add(trade.getSymbol());

        }

        System.out.println(symbols);

        symbols=trades.stream().map(trade -> trade.getSymbol()).collect(Collectors.toList());
        symbols=trades.stream().map(Trade::getSymbol).collect(Collectors.toList());
        List<Trade> tradeUpdated=trades.stream().map(StreamExample::updateResult).collect(Collectors.toList());
        System.out.println(symbols);

        */
/*



           Reduce example:
           In the reduce we iterate the collection and get the desired result over the all aggregated values.

        Double totalResult=0.0;
        for(Trade trade:trades){
            totalResult+=trade.getResult();
        }
        System.out.println(totalResult);

        totalResult=trades.stream().map(Trade::getResult).mapToDouble(Double::doubleValue).sum();
        System.out.println(totalResult);

        totalResult=trades.stream().map(Trade::getResult).reduce(100000.0,(x,y) -> x+y);
        System.out.println(totalResult);
*/

   /*   Optional example
      :1. check if present (.isPresent method)
      2. get the value
      3. orElse if value not return default ( anything including custom exception)
*/
        Optional<Integer> a=Optional.empty();
        Integer b=null;

        if(a.isPresent())
            System.out.println(a.get());
        if(b.equals(20))
            System.out.println();

        Optional<Trade> myfirstLossTrade=trades.stream().filter(trade -> trade.getResult()< 0.0).findFirst();

        if(myfirstLossTrade.isPresent())
            System.out.println(myfirstLossTrade.get());

     /*   List<List<Trade>> myNestedTrade=new ArrayList<>(); //input
        //flatMap


        List<Trade> mergedTrade=new ArrayList<>(); //output

        mergedTrade=myNestedTrade.stream().flatMap(List::stream).collect(Collectors.toList());*/


        List<List<Trade>> myNestedTrade=new ArrayList<>();



        //Stream are not collections, they are operations over the collection.

        /*
        * 3 types of anymous function
        * 1. Consumer - accepts 1 param and returns void
        * 2. Supplier - accepts nothing, returns value.
        * 3. Predicate - accepts param and returns value
        * */

        // " :: "  reference


    List<String> symbols=new ArrayList<>();

    //trades.stream().map(t -> t.getResult()).collect(Collectors.toList());


//        Stream<Trade> symbolsStream=trades.stream().filter(trade -> trade.getResult()>0.0);
//        symbolsStream=symbolsStream.filter(t -> t.getBuyPrice()>1000);
//        symbolsStream=symbolsStream.filter(t -> t.getSellPrice()>1000);
//        List<Object> symbols=symbolsStream.collect(Collectors.toList());


         /*

         trades list
        1.how many total trades are profitable vs loss ones
        2.Did I ended up profitable the previous year
        3.Which trades had max loss vs which had max profit
        4.group my trades based on symbol.
        5.group trades by profit loss per month

          */



        // 1 object in a stream is picked as refrence and then shared to println method
        trades.stream().forEach(t -> {
            t.setSymbol("TCS");


        });

        trades.stream().filter(t -> t.getResult()>0).findFirst();


    }

//    public static Trade updateResult(Trade trade){
//        trade.setResult(trade.getResult()*0.7);
//    }
}
