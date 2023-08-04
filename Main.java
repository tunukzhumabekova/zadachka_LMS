import java.time.LocalDate;
import java.util.Scanner;

                public class Main {
                    public static void main(String[] args) {
                        Scanner scan = new Scanner(System.in);

                        University university = new University();
                        Object[] univer = new Object[4];
                        School school = new School();
                        Object[] schools = new Object[3];
                        Person person = new Person();
                        Object[] persons = new Object[2];
                        Car car = new Car();
                        Object[] cars = new Object[4];



                                    univer[0] = university.setNameUniver("Manas");
                                    univer[1] = university.setDatafoundation(1995);
                                    univer[2] = university.setOrintion("Engineering");
                                    univer[3] = person.setName("Asan");
                                    for (int i = 0; i < univer.length; i++) {
                                        System.out.println("=============================================");
                                        System.out.println("*|UNIVERSITY|*:");
                                        System.out.println("Name: " + university.getNameUniver());
                                        System.out.println("Based: " + university.getDatafoundation());
                                        System.out.println("Orintion: " + university.getOrintion());
                                        System.out.println("Mentor: " + person.getName());
                                        System.out.println("=============================================");
break;
                                    }

                                    // SCHOL
                                    schools[0] = school.setNumberSchool(24);
                                    schools[1] = school.setQuantityStudents(200);

                                    schools[2] = person.setName("Asan");
                                    for (int i = 0; i < schools.length; i++) {
                                        System.out.println("=============================================");
                                        System.out.println("*|SCHOOL|*:");
                                        System.out.println("Number school: " + school.getNumberSchool());
                                        System.out.println("Quantity of students: " + school.getQuantityStudents());
                                        System.out.println("Mentor: " + person.getName());
                                        System.out.println("=============================================");
                                        break;
                                    }


                                    // PERSON
                                    persons[0] = person.setName("Tunuk");
                                    persons[1] = person.setAge(15);
                                    for (int i = 0; i < persons.length; i++) {
                                        System.out.println("=============================================");
                                        System.out.println("*|PERSON|*:");
                                        System.out.println("Name: " + person.getName());
                                        System.out.println("Age: " + person.getAge());
                                        System.out.println("=============================================");
                                        break;
                                    }
                                    // CAR
                                    cars[0] = person.setName("Carol");
                                    cars[1] = car.setBrand("Honda");
                                    cars[2] = car.setNumber(5915);
                                    cars[3] = car.setSpeed(100);
                                    for (int i = 0; i < cars.length; i++) {
                                        System.out.println("=============================================");
                                        System.out.println("*|SCHOOL|*:");
                                        System.out.println("Driver name: " + car.getName());
                                        System.out.println("Brand: " + car.getBrand());
                                        System.out.println("Car number: " + car.getNumber());
                                        System.out.println("Speed: " + car.getSpeed());
                                        System.out.println("=============================================");
                                        break;
                                    }
                            }
                        }













