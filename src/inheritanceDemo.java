                            public class inheritanceDemo {
                                public static void main(String[] args) {
                                    Dogs d1 = new Dogs();
                                    d1.f1();
                                }
                            }
                            //why inheritance?
                            //dry principle = which makes opps good
                            class Animal{
                                Animal(){
                                    System.out.println("This is animal");
                                }
                              public void breathe(){
                            
                                  System.out.println("Animal is breathing");
                              }
                              public void eat(){
                                  System.out.println("Animal is eating");
                              }
                              public void sleep(){
                                  System.out.println("Animal is sleeping");
                              }
                            }
                            
                            class Dogs extends Animal {
                                Dogs(){
                                    super();
                                }
                            
                                public void eat(){
                                    System.out.println("Dog is eating");
                                }
                                public void f1(){
                                    this.eat();
                                    //why we required this keyword?
                                }
                            
                            
                                //anotations is just a tag which represent what the functionality is doing (metadata) helps us to read the code
                                public void breathe(){
                                    System.out.println("Dog is breathing");
                                }
                            
                                public void sleep(){
                                    System.out.println("Dog is sleeping");
                                }
                            
                            
                            }
                            class Cats extends Animal{
                            
                            }
                            //This and super keywords have increased the complexity of java
                            //c and c++ uses direct references and thats why they are faster
                            //Complete day 8 and 9 assignmentts and show it to me
                            //this keyword example and explaination and compile time polymerphism overloading