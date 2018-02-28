/**
   Клас реалізовує калькулятор.
*/
public class Calculator{
   /**
      Результат обчислення.
   */
   private int result;
   /**
      Додаємо аргументи.
      @param params Аргументи додавання.
   */
   public void add(int ... params){
       for (Integer param : params){
           this.result += param;
        }
    }
    /**
       Отримати результат.
       @return результат обчислення.
    */ 
    public int getResult(){
         return this.result;
     }
     /**
        Очистити результат обчислення
     */
      public void cleanResult(){
             this.result = 0;
      }
}
