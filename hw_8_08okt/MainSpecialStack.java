package de.telran.hw_8_08okt;

public class MainSpecialStack {
  //  1) Задача getMin().
  //Реализовать структуру данных SpecialStack,
  // которая поддерживает все операции со стеком,
  //такие как push(), pop(), isEmpty(), … и дополнительную операцию getMin(),
  //которая должна возвращать минимальный элемент из SpecialStack.
  //Все эти операции SpecialStack должны быть O(1). Пространство O(n)
  //Чтобы реализовать SpecialStack, используйте структуру данных Stack,
  // реализованную ранее в классе.
    public static void main(String[] args) {
      SpecialStack specialStack=new SpecialStack();
        specialStack.push(10);
        specialStack.push(15);
        specialStack.push(20);
        specialStack.push(7);
        specialStack.push(15);
        specialStack.push(30);
        specialStack.push(16);
        specialStack.push(45);
        specialStack.push(87);
        specialStack.push(50);
      System.out.println();
        specialStack.push(25);  // проверка на переполняемость ( это 11-й эл-т)
      System.out.println();
        System.out.println("верхний элемент =  " + specialStack.peek());
      System.out.println();
        System.out.println("минимальный элемент =  " + specialStack.getMin());
      System.out.println();
      System.out.print(" содержимое нашего стека на текущий момент:  ");
        specialStack.print();
    }
    }

