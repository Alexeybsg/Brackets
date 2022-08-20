package org.example;

import java.util.*;

public class Stepik3 {  // обработчик пакетов
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        String[] string = temp.split(" ");
        int stackSize = Integer.parseInt(string[0]);
        int n = Integer.parseInt(string[1]);
        Queue<Packet> queue = new LinkedList();
        for (int i = 0; i < n; i++) {
            temp = scanner.nextLine();
            string = temp.split(" ");
            queue.add(new Packet(Integer.parseInt(string[0]),Integer.parseInt(string[1])));
        }
       getPacketsNew(queue, stackSize);



    }

    public static void getPacketsNew(Queue<Packet> queue, int stackSize) { //вход фукциии очередь из пакетов во времени
        Queue<Packet> stack = new LinkedList<>(); // очередь стека
        int time=0;
        int delay=0;
        boolean flag = false; // флаг занятости
        int timeWhenProcessorHasRest=0;


        while (true){ // цикл наполнения
            if(queue.size() != 0) {
                while (queue.peek().getArrival() <= time) {

                    if(flag == true && stack.size() == stackSize){
                        queue.poll();
                        System.out.println("-1");
                        break;
                    }

                    if (stack.size() < stackSize) {
                        if(queue.peek().duration == 0 && stack.size() == 0){
                            queue.poll();
                            System.out.println(time);
                            if(queue.size() == 0){
                                break;
                            }
                            continue;
                        }
                        if(stack.size() == 0){
                            stack.add(queue.poll());
                            timeWhenProcessorHasRest=time;
                        } else {
                            stack.add(queue.poll()); // перемещаем пакет в стек
                            timeWhenProcessorHasRest = stack.peek().duration + timeWhenProcessorHasRest;
                        }
                        if(flag== true) { // если процессор занят
                            System.out.println(timeWhenProcessorHasRest);
                        }else{ //если не занят
//                            if(stack.size() == 1){
//                                System.out.println(stack.peek().arrival);
//                            } else
                            System.out.println(timeWhenProcessorHasRest);
                        }
                    } else {
                        queue.poll();
                        System.out.println("-1");

                    }
                    if (queue.size() == 0) {
                        break;
                    }
                }
            }
            while (true) { // цикл выполнения
                // наполнили стек теперь переходим к выполнению
                if (stack.size() != 0 && flag == false) {
                    flag = true;
                    if (stack.peek().duration == 0) {
                        delay = time;
                    } else
                    delay = stack.peek().getDuration() + time;// время когда работа с пакетом закончится
                }

//            проверяем пора ли закончить
                if (flag == true && time == delay) {
                    flag = false;
                    timeWhenProcessorHasRest =stack.peek().duration;
                    stack.poll();
                }
                if(flag == true || stack.size() == 0){
                    break;
                }
            }
            if(stack.size() == 0 && queue.size() == 0){
                break;
            }

            time++;


        }



    }
}

class Packet{
    int arrival;
    int duration;

    int startPoint;

    int stopPoint;
    public Packet(int arrival, int duration) {
        this.arrival = arrival;
        this.duration = duration;
    }

    public int getArrival() {
        return arrival;
    }

    public void setArrival(int arrival) {
        this.arrival = arrival;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(int startPoint) {
        this.startPoint = startPoint;
    }

    public int getStopPoint() {
        return stopPoint;
    }

    public void setStopPoint(int stopPoint) {
        this.stopPoint = stopPoint;
    }

    @Override
    public String toString() {
        return "Packet{" +
                "arrival=" + arrival +
                ", duration=" + duration +
                '}';
    }
}
