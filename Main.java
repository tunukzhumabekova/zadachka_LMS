import java.time.LocalDate;
import java.util.Scanner;

                public class Main {
                    public static void main(String[] args) {
Car car0=new Car();
Car car1=new Car();
Car car2=new Car();
car0.setNumber(1238);
car1.setNumber(1850);
car2.setNumber(1923);
car0.setName("HONDA");
car1.setName("Tayota");
car2.setName("BMW");
car0.setPrice(10000);
car1.setPrice(20000);
car2.setPrice(30000);
Car [] cars={car0,car1,car2};
                        for (int i = 0; i < cars.length; i++) {
                            System.out.println("Name:" + cars[i].getName() + " Price:" + cars[i].getPrice() + " Number:" + cars[i].getNumber());
                        }
                            System.out.println("----------------------------------------------------");

                        Person person0=new Person();
                        Person person1=new Person();
                        Person person2=new Person();
                        person0.setName("Tunuk");
                        person1.setName("Alina");
                        person2.setName("Farida");
                        person0.setAge(15);
                        person1.setAge(21);
                        person2.setAge(20);
                        Person []people={person0,person1,person2};
                        for (int i = 0; i < people.length; i++) {
                            System.out.println("Name:" + people[i].getName() + " Age:" + people[i].getAge());
                        }
                            System.out.println("-----------------------------------------------------------");


                        School School0=new School();
                        School School1=new School();
                        School School2=new School();
                        School0.setNumberSchool(24);
                        School1.setNumberSchool(12);
                        School2.setNumberSchool(18);
                        School0.setQuantityStudents(150);
                        School1.setQuantityStudents(218);
                        School2.setQuantityStudents(290);
                        School []schools={School0,School1,School2};
                        for (int i = 0; i < people.length; i++) {
                            System.out.println("Name:" + schools[i].getNumberSchool() + " quantity:" + schools[i].getQuantityStudents());
                        }
                            System.out.println("-------------------------------------------------------------");


                        University University0=new University();
                        University University1=new University();
                        University University2=new University();
                        University0.setNameUniver("Manas");
                        University1.setNameUniver("Ala-Too");
                        University2.setNameUniver("AUCA");
                        University0.setDatafoundation(1995);
                        University1.setDatafoundation(1990);
                        University2.setDatafoundation(2010);
                        University []people1={University0,University1,University2};
                        for (int i = 0; i < people.length; i++) {
                            System.out.println("Name:" + people1[i].getNameUniver() + " Year:" + people1[i].getDatafoundation());

                        }
                            System.out.println("---------------------------------------------------------------------------");




                    }
                        }





















