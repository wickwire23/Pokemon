import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//Hello myself
public class Runner extends JFrame implements KeyListener
	{
	JLabel label;
	public Runner(String s)
	{
		super(s);
		JPanel p = new JPanel();
		label = new JLabel("Arrow Keys");
		p.add(label);
		add(p);
		addKeyListener(this);
		setSize(222,100);
		setVisible(true);
	}
	
	@Override
	public void keyPressed(KeyEvent key) {
		// TODO Auto-generated method stub
		 if (key.getKeyCode() == KeyEvent.VK_LEFT) 
		    {
		       moveLeft();
		    }

		    if (key.getKeyCode() == KeyEvent.VK_RIGHT) 
		    {
		      moveRight();
		    }

		    if (key.getKeyCode() == KeyEvent.VK_UP) 
		    {
		      moveUp();
		    }

		    if (key.getKeyCode() == KeyEvent.VK_DOWN) 
		    {
		       moveDown();
		    }
			
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent key) 
	{
	   
	}
		static int size=2;
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
		static ArrayList<Pokemon>pokemon;
		static ArrayList<Town>townChoice;
		static String[][] map=new String[10][30];
		static int col;
		static int row;
		static int yourCol=15;
		static int yourRow=4;
		static String temp1;
		static String temp2;
		public static void main(String[] args)
			{
						new Runner("Pokemon");
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
						pokemon = new ArrayList<Pokemon>();
						pokemon.add(new Pokemon("Piplup","Water",25,95,100));
						pokemon.add(new Pokemon("Turtwig","Grass",25,95,100));
						pokemon.add(new Pokemon("ChimChar","Fire",35,95,100));
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
					for(Pokemon m:pokemon)
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
					choice= userInput.nextLine();
					
					switch(choice)
					{
						case "1":
							myPokemon = pokemon.get(0);
							pokemon.remove(0);
							break;
						case "2":
							myPokemon = pokemon.get(1);
							pokemon.remove(1);
							break;
						case "3":
							myPokemon = pokemon.get(2);
							pokemon.remove(2);
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
								break;
						case 2:
							System.out.println("A great choice!");
							break;
						case 3:
							System.out.println("Prepare yourself!");
							break;
						case 4:
							System.out.println("Good luck. You will need it.");
							break;
					}
					System.out.println("Let us be Off!");
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
						System.out.println("Alrighty. Now that we hvae arrived at our destination I should probably tell you how to battle! You will encounter" + " " + (pokemon.size()-1)  + " " + "Pokemon on your adventure");
						System.out.println("Each Pokemon has an attack, defense, and Health. The attack of the Pokemon is directly related to the defense as the number of defense will block the number attack.");
						System.out.println();
						System.out.println("Hit any key  to continue");
						Scanner userInput = new Scanner(System.in);
						String continuePrompt = userInput.nextLine();
						System.out.println("Now that you know the basics lets dive right into it! You will encounter several pokemon randomly while you walk around town. Good Luck!");
					}
				
				
				public static void walkAround()
				{
					
				for(row=0;row<map.length;row++)
					{
						for(col=0;col<map[row].length;col++)
								{
									
							
					int mapFiller = (int)(Math.random()*300)+1;
					switch(mapFiller)
					{
						
						case 1:
						case 2:
						case 3:
						case 4:
						case 5:
						case 6:
						case 7:
						case 8:
						case 9:
						case 10:
						case 11:
						case 12:
						case 13:
						case 14:
						case 15:
						case 16:
						case 17:
						case 18:
						case 19:
						case 20:
						case 21:
						case 22:
						case 23:
						case 25:
						case 24:
						case 26:
						case 27:
						case 28:
						case 29:
						case 30:
							map[row][col]="*";
							break;
						case 31:
						case 32:
						case 33:
						case 34:
						case 35:
						case 36:
						case 37:
						case 38:
						case 39:
						case 40:
						case 41:
						case 42:
						case 43:
						case 44:
						case 45:
						case 46:
						case 47:
						case 48:
						case 49:
						case 50:
						case 51:
						case 52:
						case 53:
						case 54:
						case 55:
						case 56:
						case 57:
						case 58:
						case 59:
						case 60:
						case 61:
						case 62:
						case 63:
						case 64:
						case 65:
						case 66:
						case 67:
						case 68:
						case 69:
						case 70:
						case 71:
						case 72:
						case 73:
						case 74:
						case 75:
						case 76:
						case 77:
						case 78:
						case 79:
						case 80:
						case 81:
						case 82:
						case 83:
						case 84:
						case 85:
						case 86:
						case 87:
						case 88:
						case 89:
						case 90:
						case 91:
						case 92:
						case 93:
						case 94:
						case 95:
						case 96:
						case 97:
						case 98:
						case 99:
						case 100:
						case 101:
						case 102:
						case 103:
						case 104:
						case 105:
						case 106:
						case 107:
						case 108:
						case 109:
						case 110:
						case 111:
						case 112:
						case 113:
						case 114:
						case 115:
						case 116:
						case 117:
						case 118:
						case 119:
						case 120:
						case 121:
						case 122:
						case 123:
						case 125:
						case 124:
						case 126:
						case 127:
						case 128:
						case 129:
						case 130:
						case 131:
						case 132:
						case 133:
						case 134:
						case 135:
						case 136:
						case 137:
						case 138:
						case 139:
						case 140:
						case 141:
						case 142:
						case 143:
						case 144:
						case 145:
						case 146:
						case 147:
						case 148:
						case 149:
						case 150:
						case 151:
						case 152:
						case 153:
						case 154:
						case 155:
						case 156:
						case 157:
						case 158:
						case 159:
						case 160:
						case 161:
						case 162:
						case 163:
						case 164:
						case 165:
						case 166:
						case 167:
						case 168:
						case 169:
						case 170:
						case 171:
						case 172:
						case 173:
						case 174:
						case 175:
						case 176:
						case 177:
						case 178:
						case 179:
						case 180:
						case 181:
						case 182:
						case 183:
						case 184:
						case 185:
						case 186:
						case 187:
						case 188:
						case 189:
						case 190:
						case 191:
						case 192:
						case 193:
						case 194:
						case 195:
						case 196:
						case 197:
						case 198:
						case 199:
						case 200:
						case 201:
						case 202:
						case 203:
						case 204:
						case 205:
						case 206:
						case 207:
						case 208:
						case 209:
						case 210:
						case 211:
						case 212:
						case 213:
						case 214:
						case 215:
						case 216:
						case 217:
						case 218:
						case 219:
						case 220:
						case 221:
						case 222:
						case 223:
						case 224:
						case 225:
						case 226:
						case 227:
						case 228:
						case 229:
						case 230:
						case 231:
						case 232:
						case 233:
						case 234:
						case 235:
						case 236:
						case 237:
						case 238:
						case 239:
						case 240:
						case 241:
						case 242:
						case 243:
						case 244:
						case 245:
						case 246:
						case 247:
						case 248:
						case 249:
						case 250:
						case 251:
						case 252:
						case 253:
						case 254:
						case 255:
						case 256:
						case 257:
						case 258:
						case 259:
						case 260:
						case 261:
						case 262:
						case 263:
						case 264:
						case 265:
						case 266:
						case 267:
						case 268:
						case 269:
						case 270:
						case 271:
						case 272:
						case 273:
						case 274:
						case 275:
						case 276:
						case 277:
						case 278:
						case 279:
						case 280:
						case 281:
						case 282:
						case 283:
						case 284:
						case 285:
						case 286:
						case 287:
						case 288:
						case 289:
						case 290:
						case 291:
						case 292:
						case 293:
						case 294:
						case 295:
						case 296:
						case 297:
						case 298:
						case 299:
						case 300:
							map[row][col]="#";
							break;
					}
				}
			}
				temp1 =map[yourRow][yourCol];
				map[yourRow][yourCol]="0";
				for(row=0;row<map.length;row++)
					{
						System.out.println();
						for(col=0;col<map[row].length;col++)
								{
									System.out.print(map[row][col]);
									
								}
					}
		System.out.println();
		System.out.println("Here is your map! you are the '0'. Move with your arrow keys!");
		
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
					 int battleChoice = userInput.nextInt();;
					
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
				public static void moveLeft()
				{
					if(yourCol-1<0)
					{
						System.out.println("Invalid Move");
					}
					else
					{
					temp2 = map[yourRow][yourCol-1];
					map[yourRow][yourCol]=temp1;
					yourCol-=1;
					map[yourRow][yourCol]="0";
					map[yourRow][yourCol+1]=temp1;
					for(row=0;row<map.length;row++)
						{
							System.out.println();
							for(col=0;col<map[row].length;col++)
									{
										System.out.print(map[row][col]);
										
									}
						}
					System.out.println();
					temp1=temp2;
					encounter();
					}
				}
				public static void moveRight()
				{
					if(size <= 0)
					{
						endGame();
						return;
					}
					if(yourCol+1>=30)
					{
						System.out.println("Invalid Move");
					}
					else
					{
					temp2 = map[yourRow][yourCol+1];
					map[yourRow][yourCol]=temp1;
					yourCol+=1;
					map[yourRow][yourCol]="0";
					map[yourRow][yourCol-1]=temp1;
					for(row=0;row<map.length;row++)
						{
							System.out.println();
							for(col=0;col<map[row].length;col++)
									{
										System.out.print(map[row][col]);
										
									}
						}
					System.out.println();
					temp1=temp2;
					encounter();
					}
				}
				public static void moveUp()
				{
					if(size <= 0)
					{
						endGame();
						return;
					}
					if(yourRow-1<0)
					{
						System.out.println("Invalid Move");
					}
					else
					{
					temp2 = map[yourRow-1][yourCol];
					map[yourRow][yourCol]=temp1;
					yourRow-=1;
					map[yourRow][yourCol]="0";
					map[yourRow+1][yourCol]=temp1;
					for(row=0;row<map.length;row++)
						{
							System.out.println();
							for(col=0;col<map[row].length;col++)
									{
										System.out.print(map[row][col]);
										
									}
						}
					System.out.println();
					temp1=temp2;
					encounter();
					}
					
				}
				public static void moveDown()
				{
					if(size <= 0)
					{
						endGame();
						return;
					}
					if(yourRow+1>9)
					{
						System.out.println("Invalid Move");
					}
					else
					{
					temp2 = map[yourRow+1][yourCol];
					map[yourRow][yourCol]=temp1;
					yourRow+=1;
					map[yourRow][yourCol]="0";
					map[yourRow-1][yourCol]=temp1;
					for(row=0;row<map.length;row++)
						{
							System.out.println();
							for(col=0;col<map[row].length;col++)
									{
										System.out.print(map[row][col]);
										
									}
						}
					System.out.println();
					temp1=temp2;
					encounter();
					}
					
				}
				public static void encounter()
				{
					
//					int walkTime = (int)(Math.random()*8)+1;
					int pokemonEncounter = (int)(Math.random()*size);
					size--;
					battlePokemon = pokemon.get(pokemonEncounter);
					if (pokemonEncounter == 0)
						{
//							zero =  ;
							battlePokemon = pokemon.get(0);
						}
					if (pokemonEncounter == 1)
						{
//							one = ;
							battlePokemon = pokemon.get(1);
						}
					if (pokemonEncounter == 2)
						{
//							two = ;
							battlePokemon = pokemon.get(2);
						}
//					if (pokemonEncounter == 3)
//						{
//							three = pokemon.get(3);
//							battlePokemon = three;
//							
//						}
					pokemon.remove(pokemonEncounter);
					System.out.println("A wild"+" " + battlePokemon.getName()+ " " + "appeared!!");
					battle();
				}
				
			
				
}