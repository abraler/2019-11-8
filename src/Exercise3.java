

//饿汉
/*
    public class Exercise3{
        private Exercise3(){}
        private static Exercise3 b=new Exercise3();
        private static final Exercise3 method(){
            return b;
        }
    }
*/
    //懒汉
     public class Exercise3{
         private Exercise3(){}
         private static Exercise3 q=null;
         private synchronized static Exercise3 getInstance(){
             if(q==null){
                 q=new Exercise3();
             }
             return  q;
         }
}

