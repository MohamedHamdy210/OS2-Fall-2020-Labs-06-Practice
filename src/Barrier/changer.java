/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barrier;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class changer {

    public static void main(String[] args){
     Barrier bar = new Barrier_sem(2);

     Thread t1 = new Thread(new Runnable() {

     @Override
     public void run(){
     for(int y =0 ; y<2 ; y++ )
     {
       System.out.println(y);
       try{
           Thread.sleep(2000);
       }catch (InterruptedException ex) {
       Logger.getLogger(changer.class.getName()).log(Level.SEVERE , null ,ex);
       }

     }

     System.out.println("barrier boint is wait");
     bar.barrierPoint();
     System.out.println("barrier boint is exite");


     }
     });
       Thread t2 = new Thread(new Runnable() {

     @Override
     public void run(){
     for(int y =0 ; y<2 ; y++ )
     {
       System.out.println(y);
       try{
           Thread.sleep(2000);
       }catch (InterruptedException ex) {
       Logger.getLogger(changer.class.getName()).log(Level.SEVERE , null ,ex);
       }

     }

     System.out.println("barrier boint is wait");
     bar.barrierPoint();
     System.out.println("barrier boint is exite");

    }

});

       Thread t3 = new Thread(new Runnable() {

     @Override
     public void run(){
     for(int y =0 ; y<2 ; y++ )
     {
       System.out.println(y);
       try{
           Thread.sleep(2000);
       }catch (InterruptedException ex) {
       Logger.getLogger(changer.class.getName()).log(Level.SEVERE , null ,ex);
       }

     }

     System.out.println("barrier boint is wait");
     bar.barrierPoint();
     System.out.println("barrier boint is exite");

    }

});

        Thread t4 = new Thread(new Runnable() {

     @Override
     public void run(){
     for(int y =0 ; y<2 ; y++ )
     {
       System.out.println(y);
       try{
           Thread.sleep(2000);
       }catch (InterruptedException ex) {
       Logger.getLogger(changer.class.getName()).log(Level.SEVERE , null ,ex);
       }

     }

     System.out.println("barrier boint is wait");
     bar.barrierPoint();
     System.out.println("barrier boint is exite");

    }

});

       t1.start();
         t2.start();
         t3.start();
         t4.start();
    }
}
