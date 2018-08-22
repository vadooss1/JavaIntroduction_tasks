package com.company.implemica_vadim_vz;


import com.google.gson.Gson;

public class Task2 {
    public static void main(String[] args) {
        Gson json = new Gson();
        //create an array of the class City objects
        City[] city = {new City("Gdansk", 2), new City("Bydgoszcz", 3),
                new City("Torun", 3), new City("Warszawa", 2)};
        //to initialize the index and cost of "Gdansk"
        city[0].index[0] = 2; city[0].cost[0] = 1;
        city[0].index[1] = 3; city[0].cost[1] = 3;
        //to initialize the index and cost of "Bydgoszcz"
        city[1].index[0] = 1; city[1].cost[0] = 1;
        city[1].index[1] = 3; city[1].cost[1] = 1;
        city[1].index[2] = 4; city[1].cost[2] = 4;
        //to initialize the index and cost of "Torun"
        city[2].index[0] = 1; city[2].cost[0] = 3;
        city[2].index[1] = 2; city[2].cost[1] = 1;
        city[2].index[2] = 4; city[2].cost[2] = 1;
        //to initialize the index and cost of "Warszawa"
        city[3].index[0] = 2; city[3].cost[0] = 4;
        city[3].index[1] = 3; city[3].cost[1] = 1;

        int userEnterFrom = 1; //This number you can change for a test
        int userEnterTo = 4;   //This number you can change for a test

        int result = minCost(userEnterFrom, userEnterTo, city);

        System.out.println(json.toJson(city));
        System.out.println("--");
        System.out.println("From " + city[userEnterFrom - 1].name + " to " + city[userEnterTo - 1].name +
                " the minimum cost -> " + result + ".");

    }
//This function performances the Dijkstra's algorithm and returns a value minimum cost last point("finish")
    static int minCost(int start, int finish, City[] city) {
        int[] point = new int[city.length];
        boolean[] check = new boolean[city.length];
        int min;
        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city[start - 1].neighbors; j++) {
                if (check[city[start - 1].index[j] - 1] == false && point[city[start - 1].index[j] - 1] == 0
                        || point[city[start - 1].index[j] - 1] > (point[start - 1] + city[start - 1].cost[j])) {
                    point[city[start - 1].index[j] - 1] = point[start - 1] + city[start - 1].cost[j];
                }

            }
            check[start - 1] = true;
            min = point[city[start - 1].index[0] - 1];
            int temp = city[start - 1].index[0];
            for (int k = 0; k < city[start - 1].neighbors; k++) {
                if (min == 0 || min > point[city[start - 1].index[k] - 1]&&check[city[start - 1].index[k] - 1]==false){
                    min = point[city[start - 1].index[k] - 1];
                    temp = city[start - 1].index[k];
                }

            }
            start = temp;

        }

        return point[finish - 1];
    }
}
