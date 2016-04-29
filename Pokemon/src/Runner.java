import java.util.ArrayList;
import java.util.Scanner;
//Hello myself
public class Runner
	{
		static int size=4;
		static int pokemonEncounter;
		static Pokemon myPokemon;
		static Pokemon battlePokemon;
		static Pokemon zero;
		static Pokemon one;
		static Pokemon two;
		static Pokemon three;
		static String choice;
		static String continuePrompt;
		static int townChoice2=0;
		static ArrayList<Pokemon>pokemonStats;
		static ArrayList<Town>townChoice;
		public static void main(String[] args)
			{
						greetPlayer();
						createStats();
						choosePokemon();
						startAdventure();
						explainBattle();
						walkAround();
			}
				public static void greetPlayer()
				{
					System.out.println("Welcome to the World of Pokemon! What is your name?");
					Scanner userInput = new Scanner(System.in);
					String playerName= userInput.nextLine();
					System.out.println("Hi" +" " +playerName + "!");
				}
				public static void createStats()
					{
						pokemonStats = new ArrayList<Pokemon>();
						pokemonStats.add(new Pokemon("Pikachu","Electric",25,95,90,100));
						pokemonStats.add(new Pokemon("Gengar","Ghost and Poisen",25,95,110,100));
						pokemonStats.add(new Pokemon("Turtwig","Grass",25,95,31,100));
						pokemonStats.add(new Pokemon("Farfetch'd","Normal and Flying",35,100,60,100));
						pokemonStats.add(new Pokemon("Celebi","Phychc and Grass",25,100,100,100));
			}
				public static void choosePokemon()
				{
					System.out.println("Choose your Pokemon!");
					try
						{
							Thread.sleep(1500);
						} catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					System.out.println("Here are your choices!");
					
					try
						{
							Thread.sleep(1500);
						} catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					int counter=0;
					for(Pokemon m:pokemonStats)
						{
							counter++;
							System.out.println("(" + counter +")" +" " + m.getName());
							try
								{
									Thread.sleep(1000);
								} catch (InterruptedException e)
								{
									e.printStackTrace();
								}
						}
					Scanner userInput = new Scanner(System.in);
					String choice= userInput.nextLine();
					switch(choice)
					{
						case "1":
							myPokemon = pokemonStats.get(0);
							pokemonStats.remove(0);
							break;
						case "2":
							myPokemon = pokemonStats.get(1);
							pokemonStats.remove(1);
							break;
						case "3":
							myPokemon = pokemonStats.get(2);
							pokemonStats.remove(2);
							break;
						case "4":
							myPokemon = pokemonStats.get(3);
							pokemonStats.remove(3);
							break;
						case "5":
							myPokemon = pokemonStats.get(4);
							pokemonStats.remove(4);
							break;
					}
					System.out.println("Fantastic! You picked"+ " " + myPokemon.getName() );
								
				}
				public static void startAdventure()
				{
					System.out.println();
					System.out.println("Now that you have picked your Pokemon it is time to venture out into the world and battle with others!");
					Scanner userInput = new Scanner(System.in);
					
					System.out.println("Which town would you like to venture to?");
					try
						{
							Thread.sleep(1000);
						} catch (InterruptedException e)
						{
							e.printStackTrace();
						}
							townChoice = new ArrayList<Town>();
							townChoice.add(new Town("(1)","Pallet Town",""));
							townChoice.add(new Town("(2)","Veridian City",""));
							townChoice.add(new Town("(3)","Victory Road",""));
							townChoice.add(new Town("(4)","Mount Cornet",""));
							for(Town m:townChoice)
								{
									System.out.println(m.getNumber()+m.getTownName()+m.getDifficulty());
									try
										{
											Thread.sleep(1000);
										} catch (InterruptedException e)
										{
											e.printStackTrace();
										}
								}	
					int townChoice2= userInput.nextInt();
					switch(townChoice2)
					{
						case 1:
								System.out.println("Fantastic! Welcome young padawan!");
								break;
						case 2:
							System.out.println("A great choice for a casual player!");
							break;
						case 3:
							System.out.println("Ohhhhhh someone wants a bit of a challenge! Prepare yourself!");
							break;
						case 4:
							System.out.println("Good luck. You will need it.");
							break;
					}
					System.out.println("Now that you have chosen your location it is time to travel!");
					System.out.println(".");
					try
						{
							Thread.sleep(1000);
						} catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					System.out.println("..");
					try
						{
							Thread.sleep(1000);
						} catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					System.out.println("...");
					try
						{
							Thread.sleep(1000);
						} catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					System.out.println("We have arrived at " + townChoice.get(townChoice2 -1).getTownName() + "!");
					
				}
				public static void explainBattle()
					{
						System.out.println();
						System.out.println("Alrighty. Now that we hvae arrived at our destination I should probably tell you how to battle! You will encounter" + " " + (pokemonStats.size()-1)  + " " + "Pokemon on your adventure");
						System.out.println("Each Pokemon has an attack, defense, and speed. The attack of the Pokemon is directly related to the defense as the number of defense will block the number attack. The speed of the Pokemon is the chance of him dodging the attack.");
						System.out.println("Each Pokemon has one attack and the fastest pokemon will go first!");
						System.out.println("Hit any key  to continue");
						Scanner userInput = new Scanner(System.in);
						String continuePrompt = userInput.nextLine();
						System.out.println("Now that you know the basics lets dive right into it! You will encounter several pokemon randomly while you walk around town. Good Luck!");
					}
				public static void walkAround()
				{
					int walkTime = (int)(Math.random()*8)+1;
					System.out.println("What a Beautiful day!");
					for (int i=0; i<walkTime; i++)
						{
							try
								{
									Thread.sleep(750);
								} catch (InterruptedException e)
								{
									e.printStackTrace();
								}	
							System.out.print(".");
						}
					if(size <= 0)
					{
						endGame();
						return;
					}
					int pokemonEncounter = (int)(Math.random()*size);
					size--;
					battlePokemon = pokemonStats.get(pokemonEncounter);
					pokemonStats.remove(pokemonEncounter);
//					if (pokemonEncounter == 0)
//						{
//							zero = pokemonStats.get(0) ;
//							battlePokemon = zero;
//						}
//					if (pokemonEncounter == 1)
//						{
//							one = pokemonStats.get(1);
//							battlePokemon = one;
//						}
//					if (pokemonEncounter == 2)
//						{
//							two = pokemonStats.get(2);
//							battlePokemon = two;
//						}
//					if (pokemonEncounter == 3)
//						{
//							three = pokemonStats.get(3);
//							battlePokemon = three;
//							
//						}

					System.out.println("A wild"+" " + battlePokemon.getName()+ " " + "appeared!!");
					battle();
				}
				public static void battle()
				{
					System.out.println("What should you do?");
					System.out.println();
					System.out.println("   ~~~~~~~~~~~~~~           ~~~~~~~~    ");
					System.out.println("(1)|Quick Attack|        (2)|Harden|    ");
					System.out.println("   ~~~~~~~~~~~~~~           ~~~~~~~~    ");
					System.out.println("    ~~~~~~~~~~~~              ~~~~~   ");
					System.out.println("(3)|Swords Dance|          (4)|End|    ");
					System.out.println("    ~~~~~~~~~~~~              ~~~~~  ");
					Scanner userInput = new Scanner(System.in);
					int battleChoice = userInput.nextInt();
					switch(battleChoice)
					{
						case 1:
								{
									quickAttack();
									break;
								}
						case 2:
								{
									doHarden();
									break;
								}
						case 3:
								{
									swordsDance();
									break;
								}
						case 4:
								{
									endGame();
									break;
								}
					}
					if(battlePokemon.getHealth()<= 0)
					{
						endBattle();
						
					}
					else
						{
							aiAttack();
						}
				}
				public static void quickAttack()
				{
				battlePokemon.setHealth(battlePokemon.getHealth()-myPokemon.getAttack()+battlePokemon.getDefense()/10);
				System.out.println("The" + " " +battlePokemon.getName()+ "'s"+ " " + "health is"+ " " + battlePokemon.getHealth());
				System.out.println(battlePokemon.getName() + " " + "is angry!");
				}
				public static void doHarden()
					{
						myPokemon.setDefense(myPokemon.getDefense()+5);
						System.out.println(myPokemon.getName() + "'s"+ " " + "Defense rose!");	
					}
				public static void swordsDance()
				{
					myPokemon.setAttack(myPokemon.getAttack()+15);
					System.out.println(myPokemon.getName() + "'s"+ " " + "Attack rose!");	
				}
				public static void aiAttack()
				{
					int aiChoice = (int)(Math.random()*3)+1;
					switch(aiChoice)
					{
						case 1:
								{
									System.out.println(battlePokemon.getName() + " " + "used Quick Attack!");
									try
									{
										Thread.sleep(750);
									} catch (InterruptedException e)
									{
										e.printStackTrace();
									}	
									quickAttackAi();
									break;
								}
						case 2:
								{
									System.out.println(battlePokemon.getName() + " " + "used Harden!");
									try
									{
										Thread.sleep(750);
									} catch (InterruptedException e)
									{
										e.printStackTrace();
									}	
									doHardenAi();
									break;
								}
						case 3:
								{
									System.out.println(battlePokemon.getName() + " " + "used Swords Dance!");
									try
									{
										Thread.sleep(750);
									} catch (InterruptedException e)
									{
										e.printStackTrace();
									}	
									swordsDanceAi();
									break;
								}
					}
					if(myPokemon.getHealth()<= 0)
					{
						System.out.println("Aww sorry you lost this one! Better luck next time.");
						endGame();
					} 
					else
					{
					battle();
					}
				}
				public static void quickAttackAi()
				{
					myPokemon.setHealth(myPokemon.getHealth()-battlePokemon.getAttack()+myPokemon.getDefense()/10);
					System.out.println("Your" + " " +myPokemon.getName()+ "'s"+ " " + "health is"+ " " + myPokemon.getHealth());
					System.out.println(myPokemon.getName() + " " + "is iching to Fight!");
				}
				public static void doHardenAi()
				{
					battlePokemon.setDefense(battlePokemon.getDefense()+5);
					System.out.println(battlePokemon.getName() + "'s"+ " " + "Defense rose!");
				}
				public static void swordsDanceAi()
				{
					battlePokemon.setAttack(battlePokemon.getAttack()+15);
					System.out.println(battlePokemon.getName() + "'s"+ " " + "Attack rose!");	
				}
				public static void endBattle()
				
				{
					System.out.println("You have defeated the"+ " " + battlePokemon.getName()+ "!");
					System.out.println(" Time to continue your adventure!");
					walkAround();
				}
				public static void endGame()
				{
					System.out.println();
					System.out.println("The game has ended! I know it was very boring but hey I had fun!");
					System.exit(0);
					
				}
				
}