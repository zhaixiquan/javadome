package com.tjtc.day16;

// 一种事务的多重表现形式
// 主要包括在方法的重载
public class Animal {

    public void action(){
        System.out.println("动物发出叫声");
    }

    // instanceof 用来判断对象的类型是不是预期的类型   实例对象  instanceof 类名
    public void test(Animal animal){
        //animal.action();
        if (animal instanceof Dog) {
             Dog dog = (Dog) animal;
             dog.lookHome();
        }else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.climb();
        }
    }


}
