package com.company.sysgears_vadim_z.task2;

import java.util.LinkedList;

public class Main_task2 {
    public static void main(String[] args) {

        int capacity = 3;

        Slot car1 = new Slot(capacity);
        Slot place = new Slot(capacity);
        Slot car2 = new Slot(capacity);

        car1.loadSlot(capacity);
        LinkedList<String> strategies = performance(capacity, car1, place, car2);

        for (String i : strategies) {
            System.out.println(i);
        }

    }

    static LinkedList<String> performance(int capacity, Slot car1, Slot place, Slot car2) {
        LinkedList<String> strategies = new LinkedList<>();
        int start = 1;
        int plate;
        if (capacity % 2 == 0) {
            while (car2.end < capacity) {
                switch (start) {
                    case 1:
                        if (place.end == 0 && car2.end == 0) {
                            plate = car1.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s1_2);
                            place.push(plate);
                            start++;
                        } else if (place.end != 0 && car1.getlastPlate() % 2 != place.getlastPlate() % 2
                                && place.getlastPlate() < car1.getlastPlate()) {
                            plate = place.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s2_1);
                            car1.push(plate);
                        } else if (car2.end != 0 && car1.getlastPlate() % 2 != car2.getlastPlate() % 2
                                && car2.getlastPlate() < car1.getlastPlate()) {
                            plate = car2.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s3_1);
                            car1.push(plate);
                        } else if (place.end != 0 && car2.end != 0 && place.getlastPlate() % 2 != car2.getlastPlate() % 2 &&
                                place.getlastPlate() > car2.getlastPlate()) {
                            plate = car2.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s3_2);
                            place.push(plate);
                            start++;
                        } else if (place.end != 0 && car2.end != 0 && place.getlastPlate() % 2 != car2.getlastPlate() % 2 &&
                                place.getlastPlate() < car2.getlastPlate()) {
                            plate = place.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s2_3);
                            car2.push(plate);
                            start += 2;
                        } else if (place.end == 0 && car2.end != 0) {
                            plate = car2.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s3_2);
                            place.push(plate);
                            start++;
                        } else if (place.end != 0 && car2.end == 0) {
                            plate = place.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s2_3);
                            car2.push(plate);
                            start += 2;
                        }
                        break;
                    case 2:
                        if (place.getlastPlate() % 2 != car1.getlastPlate() % 2 && car1.end != 0 &&
                                car1.getlastPlate() < place.getlastPlate()) {
                            plate = car1.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s1_2);
                            place.push(plate);
                        } else if (place.getlastPlate() % 2 != car2.getlastPlate() % 2 && car2.end != 0
                                && car2.getlastPlate() < place.getlastPlate()) {
                            plate = car2.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s3_2);
                            place.push(plate);
                        } else if (car1.end != 0 && car2.end != 0 && car1.getlastPlate() % 2 != car2.getlastPlate() % 2 &&
                                car1.getlastPlate() > car2.getlastPlate()) {
                            plate = car2.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s3_1);
                            car1.push(plate);
                            start--;
                        } else if (car1.end != 0 && car2.end != 0 && car1.getlastPlate() % 2 != car2.getlastPlate() % 2 &&
                                car1.getlastPlate() < car2.getlastPlate()) {
                            plate = car1.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s1_3);
                            car2.push(plate);
                            start++;
                        } else if (car1.end == 0 && car2.end != 0) {
                            plate = car2.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s3_1);
                            car1.push(plate);
                            start--;
                        } else if (car1.end != 0 && car2.end == 0) {
                            plate = car1.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s1_3);
                            car2.push(plate);
                            start++;
                        }
                        break;
                    case 3:
                        if (place.end != 0 && car2.getlastPlate() % 2 != place.getlastPlate() % 2
                                && place.getlastPlate() < car2.getlastPlate()) {
                            plate = place.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s2_3);
                            car2.push(plate);
                        } else if (car1.end != 0 && car2.getlastPlate() % 2 != car1.getlastPlate() % 2
                                && car1.getlastPlate() < car2.getlastPlate()) {
                            plate = car1.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s1_3);
                            car2.push(plate);
                        } else if (place.end != 0 && car1.end != 0 && place.getlastPlate() % 2 != car1.getlastPlate() % 2 &&
                                place.getlastPlate() > car1.getlastPlate()) {
                            plate = car1.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s1_2);
                            place.push(plate);
                            start--;
                        } else if (place.end != 0 && car1.end != 0 && place.getlastPlate() % 2 != car1.getlastPlate() % 2 &&
                                place.getlastPlate() < car1.getlastPlate()) {
                            plate = place.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s2_1);
                            car1.push(plate);
                            start -= 2;
                        } else if (place.end == 0 && car1.end != 0) {
                            plate = car1.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s1_2);
                            place.push(plate);
                            start--;
                        } else if (place.end != 0 && car1.end == 0) {
                            plate = place.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s2_1);
                            car1.push(plate);
                            start -= 2;
                        }
                        break;

                }


            }

        } else {
            while (car2.end < capacity) {
                switch (start) {
                    case 1:
                        if (place.end == 0 && car2.end == 0) {
                            plate = car1.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s1_3);
                            car2.push(plate);
                            start += 2;
                        } else if (place.end != 0 && car1.getlastPlate() % 2 != place.getlastPlate() % 2
                                && place.getlastPlate() < car1.getlastPlate()) {
                            plate = place.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s2_1);
                            car1.push(plate);
                        } else if (car2.end != 0 && car1.getlastPlate() % 2 != car2.getlastPlate() % 2
                                && car2.getlastPlate() < car1.getlastPlate()) {
                            plate = car2.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s3_1);
                            car1.push(plate);
                        } else if (place.end != 0 && car2.end != 0 && place.getlastPlate() % 2 != car2.getlastPlate() % 2 &&
                                place.getlastPlate() > car2.getlastPlate()) {
                            plate = car2.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s3_2);
                            place.push(plate);
                            start++;
                        } else if (place.end != 0 && car2.end != 0 && place.getlastPlate() % 2 != car2.getlastPlate() % 2 &&
                                place.getlastPlate() < car2.getlastPlate()) {
                            plate = place.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s2_3);
                            car2.push(plate);
                            start += 2;
                        } else if (place.end == 0 && car2.end != 0) {
                            plate = car2.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s3_2);
                            place.push(plate);
                            start++;
                        } else if (place.end != 0 && car2.end == 0) {
                            plate = place.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s2_3);
                            car2.push(plate);
                            start += 2;
                        }
                        break;
                    case 2:
                        if (place.getlastPlate() % 2 != car1.getlastPlate() % 2 && car1.end != 0 &&
                                car1.getlastPlate() < place.getlastPlate()) {
                            plate = car1.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s1_2);
                            place.push(plate);
                        } else if (place.getlastPlate() % 2 != car2.getlastPlate() % 2 && car2.end != 0
                                && car2.getlastPlate() < place.getlastPlate()) {
                            plate = car2.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s3_2);
                            place.push(plate);
                        } else if (car1.end != 0 && car2.end != 0 && car1.getlastPlate() % 2 != car2.getlastPlate() % 2 &&
                                car1.getlastPlate() > car2.getlastPlate()) {
                            plate = car2.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s3_1);
                            car1.push(plate);
                            start--;
                        } else if (car1.end != 0 && car2.end != 0 && car1.getlastPlate() % 2 != car2.getlastPlate() % 2 &&
                                car1.getlastPlate() < car2.getlastPlate()) {
                            plate = car1.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s1_3);
                            car2.push(plate);
                            start++;
                        } else if (car1.end == 0 && car2.end != 0) {
                            plate = car2.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s3_1);
                            car1.push(plate);
                            start--;
                        } else if (car1.end != 0 && car2.end == 0) {
                            plate = car1.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s1_3);
                            car2.push(plate);
                            start++;
                        }
                        break;
                    case 3:
                        if (place.end != 0 && car2.getlastPlate() % 2 != place.getlastPlate() % 2
                                && place.getlastPlate() < car2.getlastPlate()) {
                            plate = place.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s2_3);
                            car2.push(plate);
                        } else if (car1.end != 0 && car2.getlastPlate() % 2 != car1.getlastPlate() % 2
                                && car1.getlastPlate() < car2.getlastPlate()) {
                            plate = car1.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s1_3);
                            car2.push(plate);
                        } else if (place.end != 0 && car1.end != 0 && place.getlastPlate() % 2 != car1.getlastPlate() % 2 &&
                                place.getlastPlate() > car1.getlastPlate()) {
                            plate = car1.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s1_2);
                            place.push(plate);
                            start--;
                        } else if (place.end != 0 && car1.end != 0 && place.getlastPlate() % 2 != car1.getlastPlate() % 2 &&
                                place.getlastPlate() < car1.getlastPlate()) {
                            plate = place.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s2_1);
                            car1.push(plate);
                            start -= 2;
                        } else if (place.end == 0 && car1.end != 0) {
                            plate = car1.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s1_2);
                            place.push(plate);
                            start--;
                        } else if (place.end != 0 && car1.end == 0) {
                            plate = place.pull();
                            strategies.addLast("#" + plate + " " + Strategy.s2_1);
                            car1.push(plate);
                            start -= 2;
                        }
                        break;

                }


            }
        }
        return strategies;
    }

}
