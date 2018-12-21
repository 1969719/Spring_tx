package org.lanqiao.tx.ex;

public class PayException extends RuntimeException {
   public   PayException (){
            super();
   }
    public   PayException (String message){
            super(message);
    }
}
