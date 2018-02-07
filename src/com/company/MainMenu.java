package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    private Scanner input = new Scanner(System.in);

    protected void createCar() {

        System.out.println("What car would you like to create?");
        System.out.println("1.Custom \n2. Ready to go \n3.Exit");

        try {
            switch (input.nextInt()) {
                case 1:
                    //Accel
                    Car car = new Car();
                    menu(car);
                    break;
                case 2:
                    //Decel
                    Corvette corvette = new Corvette(2018,"Corvette","Z06",0,100,"Red");
                    corvette.getCorvetteinfo();
                    menu(corvette);
                    break;
                case 3:
                    //gas
                    System.exit(0);
                    break;
                    default:
                    System.out.println("Please enter a number between 1 and 3");
                    createCar();
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please enter a number between 1 and 3");

        }
    }

    public void menu (Car car) {

        System.out.println("What would you like to do with the " + car.getMake() + " " + car.getModel() +"?");
        System.out.println("1.Accelerate \n2. Decelerate \n3.Fill Up With Gas \n4.Exit");

        try {
            switch (input.nextInt()) {
                case 1:
                    //Accel
                    car.driveCar(car);
                    break;
                case 2:
                    //Decel
                    car.slowCar(car);
                    break;
                case 3:
                    //gas
                    car.addGas(car);
                    break;
                case 4:
                    //exit
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 4");
                    menu(car);
            }
            } catch (InputMismatchException ime) {
                input.nextLine();
                System.out.println("Please enter a number between 1 and 4");


            }
        }
    }

