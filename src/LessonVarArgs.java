public class LessonVarArgs {
    public static void  main(String[] args){
        String st1 = "Test";
        String st2 = "Test1";
        int qrr[] = {1,2,3,4,5};
        int i = 5;
        int b = 6;
        int y = 7;
        int z = 8;
        System.out.println(sum(i,b));
        System.out.println(sum(i,b,y));
        System.out.println(sum(i,b,y,z));
        /*System.out.println(sum(qrr));
        System.out.println(sum());*/
        System.out.println();
        print(st1,i,b);



    }
   /* Основные правила использования данного инструмента:
            1. Синтаксис: тип ... имя_переменной
        2. Список аргументов в Varargs одного типа, указанного до трёх точек.
        2. В метод можно передать только один такой аргумент.
            3. Помимо Varargs в метод можно передавать и другие аргументы любых типов, но аргумент Varargs должен быть
    последним в списке.
        4. Аргумент Varargs не является обязательным при вызове метода. Такой метод можно вызвать без аргумента.
            5. В методе Varargs принимается как обычный статический массив и обрабатывается так же.
            6. Не стоит перегружать метод, у которого совпадают все компоненты сигнатуры кроме Varargs, так как при вызове
    этого метода без аргумента компилятор даст ошибку.
        7. В качестве аргумента Varargs можно передавать как обычный статический массив так и список обычных аргументов
    через запятую. Единственное правило - они должны быть одного типа.*/

   public static int sum(int x, int y){
        return x + y ;

    }
    public static int sum(int x, int y,int t){
        return x + y + t;

    }

  public static int sum(int y, int ... x){
      int sum = 0;
      for(int index = 0 ; index < x.length; index++) {
          sum += x[index];
      }
      sum = y + sum;
      return sum;
      }

      public static void print(String a, int ...x){
          for(int index = 0 ; index < x.length; index++) {
              System.out.println(x[index]);
          }
          System.out.println(a);


      }

/*    public static String sum(String ... x){
        String sum = new String();
        for(int index = 0; index < x.length; index++){
            sum += x[index];
        }
        return sum;
    }*/




  }

