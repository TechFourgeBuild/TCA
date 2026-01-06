import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {


                System.out.println("\n💖💖💖💖 ----- Welcome to TCA - Tinder Console App ----- 💖💖💖💖");
                System.out.println("🥰🥰🥰🥰 ----- Here We'll assist you to find your true love ----- 💘💘💝💝\n");

                System.out.println("Enter your name : ");
                String name = sc.nextLine();
//                sc.nextLine();

                System.out.println("Enter your age : ");
                int age = sc.nextInt();

                System.out.println("Enter your gender : ");
                String g = sc.next();
                sc.nextLine();
                String gender = g.toLowerCase();

                System.out.println("Enter your zodiacSign : ");
                String zd = sc.next();
                sc.nextLine();
                String zodiacSign = zd.toLowerCase();
//
                System.out.println("Kindly enter habits/hobbies as comma separate , look at example below 👇👇");
                System.out.println("playing cricket, listening song, dancing, etc. ");
                System.out.println("Enter your habits : ");
                String habit = sc.nextLine();
                String[] habits = habit.split(",");

                for (int i = 0; i < habits.length; i++) {
                    habits[i] = habits[i].toLowerCase().trim();
                }

                System.out.println("\n👇👇👇👇---- Here Below is Your details -----👇👇👇👇\n");
                System.out.println(" - Name :- "+name);
                System.out.println(" - Age :- "+age);
                System.out.println(" - Gender :- "+gender);
                System.out.println(" - Zodiac Sign :- "+zodiacSign);
                System.out.println(" - Habit :- "+ Arrays.toString(habits));

                UserDetails ud = new UserDetails(name , gender , habits , age , zodiacSign);
//            System.out.println("male habit : "+ Arrays.toString(ud.getHabit()));
//            System.out.println("male zodiacSign : "+ud.getZodiacSign());

                if(Objects.equals(ud.getGender(), "male"))
                {
//                System.out.println("(Arrays.equals(g10.habit, habits)) :- "+(Arrays.equals(g10.habit, habits)));
//                System.out.println("(g1.zodiacSign.equals(ud.getZodiacSign())) :- "+(g10.zodiacSign.equals(ud.getZodiacSign())));

//                if((Arrays.equals(g10.habit,habits)) && (g10.zodiacSign.equals(ud.getZodiacSign())))
//                {
//                    System.out.println("\n💘💘💘💘Congratulation profile successfully matched with "+g10.name+ " 🤩🤩🤩🥰🥰💖💖");
//
//                    System.out.println("\n------------------------Look below for more Details about - *** "+g10.name+" *** ------------------------------------------- \n");
//
//                    System.out.println("- Name : "+g10.name);
//                    System.out.println("- Age : "+g10.age);
//                    System.out.println("- Gender : "+g10.gender);
//                    System.out.println("- Zodiac Sign : "+g10.zodiacSign);
//                    System.out.println("- Habits : "+ Arrays.toString(g10.habit));
//                    System.out.println("- isLiked : "+ g10.isLiked);
//                }
//                else
//                {
//                    System.out.println("\nProfile not matched 😔😔😔😔😔");
//                }
                    System.out.println("\n ********** 💘💘 Choose the Female You want to Marry With 💘💘 ************");

                    System.out.println("\n- Name : "+g1.name);
                    System.out.println("- Age : "+g1.age);
                    System.out.println("- Gender : "+g1.gender);
                    System.out.println("- ZodiacSign : "+g1.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(g1.habit));
                    System.out.println("- isLiked You : "+g1.isLiked);
                    System.out.println("- Unique Identifier : "+g1.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("- Name : "+g9.name);
                    System.out.println("- Age : "+g9.age);
                    System.out.println("- Gender : "+g9.gender);
                    System.out.println("- ZodiacSign : "+g9.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(g9.habit));
                    System.out.println("- isLiked You : "+g9.isLiked);
                    System.out.println("- Unique Identifier : "+g9.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("- Name : "+g10.name);
                    System.out.println("- Age : "+g10.age);
                    System.out.println("- Gender : "+g10.gender);
                    System.out.println("- ZodiacSign : "+g10.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(g10.habit));
                    System.out.println("- isLiked You : "+g10.isLiked);
                    System.out.println("- Unique Identifier : "+g10.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("- Name : "+g3.name);
                    System.out.println("- Age : "+g3.age);
                    System.out.println("- Gender : "+g3.gender);
                    System.out.println("- ZodiacSign : "+g3.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(g3.habit));
                    System.out.println("- isLiked You : "+g3.isLiked);
                    System.out.println("- Unique Identifier : "+g3.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("- Name : "+g11.name);
                    System.out.println("- Age : "+g11.age);
                    System.out.println("- Gender : "+g11.gender);
                    System.out.println("- ZodiacSign : "+g11.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(g11.habit));
                    System.out.println("- isLiked You : "+g11.isLiked);
                    System.out.println("- Unique Identifier : "+g11.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("- Name : "+g4.name);
                    System.out.println("- Age : "+g4.age);
                    System.out.println("- Gender : "+g4.gender);
                    System.out.println("- ZodiacSign : "+g4.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(g4.habit));
                    System.out.println("- isLiked You : "+g4.isLiked);
                    System.out.println("- Unique Identifier : "+g4.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("- Name : "+g12.name);
                    System.out.println("- Age : "+g12.age);
                    System.out.println("- Gender : "+g12.gender);
                    System.out.println("- ZodiacSign : "+g12.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(g12.habit));
                    System.out.println("- isLiked You : "+g12.isLiked);
                    System.out.println("- Unique Identifier : "+g12.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("- Name : "+g5.name);
                    System.out.println("- Age : "+g5.age);
                    System.out.println("- Gender : "+g5.gender);
                    System.out.println("- ZodiacSign : "+g5.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(g5.habit));
                    System.out.println("- isLiked You : "+g5.isLiked);
                    System.out.println("- Unique Identifier : "+g5.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("- Name : "+g13.name);
                    System.out.println("- Age : "+g13.age);
                    System.out.println("- Gender : "+g13.gender);
                    System.out.println("- ZodiacSign : "+g13.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(g13.habit));
                    System.out.println("- isLiked You : "+g13.isLiked);
                    System.out.println("- Unique Identifier : "+g13.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("- Name : "+g6.name);
                    System.out.println("- Age : "+g6.age);
                    System.out.println("- Gender : "+g6.gender);
                    System.out.println("- ZodiacSign : "+g6.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(g6.habit));
                    System.out.println("- isLiked You : "+g6.isLiked);
                    System.out.println("- Unique Identifier : "+g6.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("- Name : "+g14.name);
                    System.out.println("- Age : "+g14.age);
                    System.out.println("- Gender : "+g14.gender);
                    System.out.println("- ZodiacSign : "+g14.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(g14.habit));
                    System.out.println("- isLiked You : "+g14.isLiked);
                    System.out.println("- Unique Identifier : "+g14.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("- Name : "+g7.name);
                    System.out.println("- Age : "+g7.age);
                    System.out.println("- Gender : "+g7.gender);
                    System.out.println("- ZodiacSign : "+g7.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(g7.habit));
                    System.out.println("- isLiked You : "+g7.isLiked);
                    System.out.println("- Unique Identifier : "+g7.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("- Name : "+g15.name);
                    System.out.println("- Age : "+g15.age);
                    System.out.println("- Gender : "+g15.gender);
                    System.out.println("- ZodiacSign : "+g15.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(g15.habit));
                    System.out.println("- isLiked You : "+g15.isLiked);
                    System.out.println("- Unique Identifier : "+g15.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("- Name : "+g8.name);
                    System.out.println("- Age : "+g8.age);
                    System.out.println("- Gender : "+g8.gender);
                    System.out.println("- ZodiacSign : "+g8.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(g8.habit));
                    System.out.println("- isLiked You : "+g8.isLiked);
                    System.out.println("- Unique Identifier : "+g8.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("- Name : "+g16.name);
                    System.out.println("- Age : "+g16.age);
                    System.out.println("- Gender : "+g16.gender);
                    System.out.println("- ZodiacSign : "+g16.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(g16.habit));
                    System.out.println("- isLiked You : "+g16.isLiked);
                    System.out.println("- Unique Identifier : "+g16.id);

                    System.out.println("\n 💝💝💝💝💝💝 Choose the female based on their **** Unique Identifier **** to get marry , 💔💔💔💔💔 Or click *** 0 *** if you not like any of them :- ");
                    int choice = sc.nextInt();
                    System.out.println("Your choice :- "+choice);

                    if(choice != 0)
                    {
                        switch (choice)
                        {
                            case 1:
                            {
//                                System.out.println("\n(Arrays.equals(g1.habit, habits)) :- "+(Arrays.equals(g1.habit, habits)));
//                                System.out.println("(g1.zodiacSign.equals(ud.getZodiacSign())) :- "+(g1.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(g1.habit,habits)) && (g1.zodiacSign.equals(ud.getZodiacSign())) && g1.isLiked)
                                {
                                    System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g1.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+g1.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+g1.name);
                                    System.out.println("- Age : "+g1.age);
                                    System.out.println("- Gender : "+g1.gender);
                                    System.out.println("- Zodiac Sign : "+g1.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(g1.habit));
                                    System.out.println("- isLiked : "+ g1.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+g1.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 30% match with " + g1.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with " + g1.name + " at this time.");
                                }
                            }
                            break;

                            case 2:
                            {
//                                System.out.println("\n(Arrays.equals(g9.habit, habits)) :- "+(Arrays.equals(g9.habit, habits)));
//                                System.out.println("(g9.zodiacSign.equals(ud.getZodiacSign())) :- "+(g9.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(g9.habit,habits)) && (g9.zodiacSign.equals(ud.getZodiacSign())) && g9.isLiked)
                                {
                                    System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n 💘💘💘💘Congratulation profile successfully matched with "+g9.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+g9.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+g9.name);
                                    System.out.println("- Age : "+g9.age);
                                    System.out.println("- Gender : "+g9.gender);
                                    System.out.println("- Zodiac Sign : "+g9.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(g9.habit));
                                    System.out.println("- isLiked : "+ g9.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+g9.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 30% match with " + g9.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + g9.name + " **** at this time.");
                                }
                            }
                            break;

                            case 3:
                            {
//                                System.out.println("\n(Arrays.equals(g2.habit, habits)) :- "+(Arrays.equals(g2.habit, habits)));
//                                System.out.println("(g2.zodiacSign.equals(ud.getZodiacSign())) :- "+(g2.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(g2.habit,habits)) && (g2.zodiacSign.equals(ud.getZodiacSign())) && g2.isLiked)
                                {
                                    System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g2.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+g2.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+g2.name);
                                    System.out.println("- Age : "+g2.age);
                                    System.out.println("- Gender : "+g2.gender);
                                    System.out.println("- Zodiac Sign : "+g2.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(g2.habit));
                                    System.out.println("- isLiked : "+ g2.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+g2.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 45% match with " + g2.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + g2.name + " **** at this time.");
                                }
                            }
                            break;

                            case 4:
                            {
//                                System.out.println("\n(Arrays.equals(g10.habit, habits)) :- "+(Arrays.equals(g10.habit, habits)));
//                                System.out.println("(g10.zodiacSign.equals(ud.getZodiacSign())) :- "+(g10.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(g10.habit,habits)) && (g10.zodiacSign.equals(ud.getZodiacSign())) && g10.isLiked)
                                {
                                    System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g10.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+g10.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+g10.name);
                                    System.out.println("- Age : "+g10.age);
                                    System.out.println("- Gender : "+g10.gender);
                                    System.out.println("- Zodiac Sign : "+g10.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(g10.habit));
                                    System.out.println("- isLiked : "+ g10.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+g10.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 20% match with " + g10.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + g10.name + " **** at this time.");
                                }
                            }
                            break;

                            case 5:
                            {
//                                System.out.println("\n(Arrays.equals(g3.habit, habits)) :- "+(Arrays.equals(g3.habit, habits)));
//                                System.out.println("(g3.zodiacSign.equals(ud.getZodiacSign())) :- "+(g3.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(g3.habit,habits)) && (g3.zodiacSign.equals(ud.getZodiacSign())) && g3.isLiked)
                                {
                                    System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g3.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+g3.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+g3.name);
                                    System.out.println("- Age : "+g3.age);
                                    System.out.println("- Gender : "+g3.gender);
                                    System.out.println("- Zodiac Sign : "+g3.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(g3.habit));
                                    System.out.println("- isLiked : "+ g3.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+g3.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 25% match with " + g3.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + g3.name + " **** at this time.");
                                }
                            }
                            break;

                            case 6:
                            {
//                                System.out.println("\n(Arrays.equals(g11.habit, habits)) :- "+(Arrays.equals(g11.habit, habits)));
//                                System.out.println("(g11.zodiacSign.equals(ud.getZodiacSign())) :- "+(g11.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(g11.habit,habits)) && (g11.zodiacSign.equals(ud.getZodiacSign())) && g11.isLiked)
                                {
                                    System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g11.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+g11.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+g11.name);
                                    System.out.println("- Age : "+g11.age);
                                    System.out.println("- Gender : "+g11.gender);
                                    System.out.println("- Zodiac Sign : "+g11.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(g11.habit));
                                    System.out.println("- isLiked : "+ g11.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+g11.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 35% match with " + g11.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + g11.name + " **** at this time.");
                                }
                            }
                            break;

                            case 7:
                            {
//                                System.out.println("\n(Arrays.equals(g4.habit, habits)) :- "+(Arrays.equals(g4.habit, habits)));
//                                System.out.println("(g4.zodiacSign.equals(ud.getZodiacSign())) :- "+(g4.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(g4.habit,habits)) && (g4.zodiacSign.equals(ud.getZodiacSign())) && g4.isLiked)
                                {
                                    System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g4.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+g4.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+g4.name);
                                    System.out.println("- Age : "+g4.age);
                                    System.out.println("- Gender : "+g4.gender);
                                    System.out.println("- Zodiac Sign : "+g4.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(g4.habit));
                                    System.out.println("- isLiked : "+ g4.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+g4.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 50% match with " + g4.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + g4.name + " **** at this time.");
                                }
                            }
                            break;

                            case 8:
                            {
//                                System.out.println("\n(Arrays.equals(g12.habit, habits)) :- "+(Arrays.equals(g12.habit, habits)));
//                                System.out.println("(g12.zodiacSign.equals(ud.getZodiacSign())) :- "+(g12.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(g12.habit,habits)) && (g12.zodiacSign.equals(ud.getZodiacSign())) && g12.isLiked)
                                {
                                    System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g12.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+g12.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+g12.name);
                                    System.out.println("- Age : "+g12.age);
                                    System.out.println("- Gender : "+g12.gender);
                                    System.out.println("- Zodiac Sign : "+g12.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(g12.habit));
                                    System.out.println("- isLiked : "+ g12.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+g12.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 48% match with " + g12.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + g12.name + " **** at this time.");
                                }
                            }
                            break;

                            case 9:
                            {
//                                System.out.println("\n(Arrays.equals(g5.habit, habits)) :- "+(Arrays.equals(g5.habit, habits)));
//                                System.out.println("(g5.zodiacSign.equals(ud.getZodiacSign())) :- "+(g5.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(g5.habit,habits)) && (g5.zodiacSign.equals(ud.getZodiacSign())) && g5.isLiked)
                                {
                                    System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g5.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+g5.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+g5.name);
                                    System.out.println("- Age : "+g5.age);
                                    System.out.println("- Gender : "+g5.gender);
                                    System.out.println("- Zodiac Sign : "+g5.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(g5.habit));
                                    System.out.println("- isLiked : "+ g5.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+g5.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 55% match with " + g5.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + g5.name + " **** at this time.");
                                }
                            }
                            break;

                            case 10:
                            {
//                                System.out.println("\n(Arrays.equals(g13.habit, habits)) :- "+(Arrays.equals(g13.habit, habits)));
//                                System.out.println("(g13.zodiacSign.equals(ud.getZodiacSign())) :- "+(g13.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(g13.habit,habits)) && (g13.zodiacSign.equals(ud.getZodiacSign())) && g13.isLiked)
                                {
                                    System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g13.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+g13.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+g13.name);
                                    System.out.println("- Age : "+g13.age);
                                    System.out.println("- Gender : "+g13.gender);
                                    System.out.println("- Zodiac Sign : "+g13.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(g13.habit));
                                    System.out.println("- isLiked : "+ g13.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+g13.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 35% match with " + g13.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + g13.name + " **** at this time.");
                                }
                            }
                            break;

                            case 11:
                            {
//                                System.out.println("\n(Arrays.equals(g6.habit, habits)) :- "+(Arrays.equals(g6.habit, habits)));
//                                System.out.println("(g6.zodiacSign.equals(ud.getZodiacSign())) :- "+(g6.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(g6.habit,habits)) && (g6.zodiacSign.equals(ud.getZodiacSign())) && g6.isLiked)
                                {
                                    System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g6.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+g6.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+g6.name);
                                    System.out.println("- Age : "+g6.age);
                                    System.out.println("- Gender : "+g6.gender);
                                    System.out.println("- Zodiac Sign : "+g6.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(g6.habit));
                                    System.out.println("- isLiked : "+ g6.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+g6.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 30% match with " + g6.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + g6.name + " **** at this time.");
                                }
                            }
                            break;

                            case 12:
                            {
//                                System.out.println("\n(Arrays.equals(g14.habit, habits)) :- "+(Arrays.equals(g14.habit, habits)));
//                                System.out.println("(g14.zodiacSign.equals(ud.getZodiacSign())) :- "+(g14.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(g14.habit,habits)) && (g14.zodiacSign.equals(ud.getZodiacSign())) && g14.isLiked)
                                {
                                    System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g14.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+g14.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+g14.name);
                                    System.out.println("- Age : "+g14.age);
                                    System.out.println("- Gender : "+g14.gender);
                                    System.out.println("- Zodiac Sign : "+g14.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(g14.habit));
                                    System.out.println("- isLiked : "+ g14.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+g14.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 30% match with " + g14.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + g14.name + " **** at this time.");
                                }
                            }
                            break;

                            case 13:
                            {
//                                System.out.println("\n(Arrays.equals(g7.habit, habits)) :- "+(Arrays.equals(g7.habit, habits)));
//                                System.out.println("(g7.zodiacSign.equals(ud.getZodiacSign())) :- "+(g7.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(g7.habit,habits)) && (g7.zodiacSign.equals(ud.getZodiacSign())) && g7.isLiked)
                                {
                                    System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g7.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+g7.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+g7.name);
                                    System.out.println("- Age : "+g7.age);
                                    System.out.println("- Gender : "+g7.gender);
                                    System.out.println("- Zodiac Sign : "+g7.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(g7.habit));
                                    System.out.println("- isLiked : "+ g7.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+g7.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 60% match with " + g7.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + g7.name + " **** at this time.");
                                }
                            }
                            break;

                            case 14:
                            {
//                                System.out.println("\n(Arrays.equals(g15.habit, habits)) :- "+(Arrays.equals(g15.habit, habits)));
//                                System.out.println("(g15.zodiacSign.equals(ud.getZodiacSign())) :- "+(g15.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(g15.habit,habits)) && (g15.zodiacSign.equals(ud.getZodiacSign())) && g15.isLiked)
                                {
                                    System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g15.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+g15.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+g15.name);
                                    System.out.println("- Age : "+g15.age);
                                    System.out.println("- Gender : "+g15.gender);
                                    System.out.println("- Zodiac Sign : "+g15.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(g15.habit));
                                    System.out.println("- isLiked : "+ g15.isLiked);

                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 58% match with " + g15.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + g15.name + " **** at this time.");
                                }
                            }
                            break;

                            case 15:
                            {
//                                System.out.println("\n(Arrays.equals(g8.habit, habits)) :- "+(Arrays.equals(g8.habit, habits)));
//                                System.out.println("(g8.zodiacSign.equals(ud.getZodiacSign())) :- "+(g8.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(g8.habit,habits)) && (g8.zodiacSign.equals(ud.getZodiacSign())) && g8.isLiked)
                                {
                                    System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g8.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+g8.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+g8.name);
                                    System.out.println("- Age : "+g8.age);
                                    System.out.println("- Gender : "+g8.gender);
                                    System.out.println("- Zodiac Sign : "+g8.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(g8.habit));
                                    System.out.println("- isLiked : "+ g8.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+g8.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 57% match with " + g8.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + g8.name + " **** at this time.");
                                }
                            }
                            break;

                            case 16:
                            {
//                                System.out.println("\n(Arrays.equals(g16.habit, habits)) :- "+(Arrays.equals(g16.habit, habits)));
//                                System.out.println("(g16.zodiacSign.equals(ud.getZodiacSign())) :- "+(g16.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(g16.habit,habits)) && (g16.zodiacSign.equals(ud.getZodiacSign())) && g16.isLiked)
                                {
                                    System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g16.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+g16.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+g16.name);
                                    System.out.println("- Age : "+g16.age);
                                    System.out.println("- Gender : "+g16.gender);
                                    System.out.println("- Zodiac Sign : "+g16.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(g16.habit));
                                    System.out.println("- isLiked : "+ g16.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+g16.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 30% match with " + g16.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + g16.name + " **** at this time.");
                                }
                            }
                            break;

                            default:
                            {
                                System.out.println("😑😑😑😑 Out of range - Kindly enter appropriate Unique Identifier 😑😑😑😑");
                                break;
                            }
                        }
                    }
                    else
                    {

                        String zodiacSignOfUser = ud.getZodiacSign();
                        boolean isMatched1 = IamTheMatcher.userMatchWithG1(habits,zodiacSignOfUser);
                        boolean isMatched2 = IamTheMatcher.userMatchWithG2(habits,zodiacSignOfUser);
                        boolean isMatched3 = IamTheMatcher.userMatchWithG3(habits,zodiacSignOfUser);
                        boolean isMatched4 = IamTheMatcher.userMatchWithG4(habits,zodiacSignOfUser);
                        boolean isMatched5 = IamTheMatcher.userMatchWithG5(habits,zodiacSignOfUser);
                        boolean isMatched6 = IamTheMatcher.userMatchWithG6(habits,zodiacSignOfUser);
                        boolean isMatched7 = IamTheMatcher.userMatchWithG7(habits,zodiacSignOfUser);
                        boolean isMatched8 = IamTheMatcher.userMatchWithG8(habits,zodiacSignOfUser);
                        boolean isMatched9 = IamTheMatcher.userMatchWithG9(habits,zodiacSignOfUser);
                        boolean isMatched10 = IamTheMatcher.userMatchWithG10(habits,zodiacSignOfUser);
                        boolean isMatched11 = IamTheMatcher.userMatchWithG11(habits,zodiacSignOfUser);
                        boolean isMatched12 = IamTheMatcher.userMatchWithG12(habits,zodiacSignOfUser);
                        boolean isMatched13 = IamTheMatcher.userMatchWithG13(habits,zodiacSignOfUser);
                        boolean isMatched14 = IamTheMatcher.userMatchWithG14(habits,zodiacSignOfUser);
                        boolean isMatched15 = IamTheMatcher.userMatchWithG15(habits,zodiacSignOfUser);
                        boolean isMatched16 = IamTheMatcher.userMatchWithG16(habits,zodiacSignOfUser);
                        if(isMatched1)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... ");
                            System.out.println("\n 40% Matched .......... ");
                            System.out.println("\n 60% Matched .............. ");
                            System.out.println("\n 80% Matched ................. ");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g1.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+g1.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+g1.name);
                            System.out.println("- Age : "+g1.age);
                            System.out.println("- Gender : "+g1.gender);
                            System.out.println("- Zodiac Sign : "+g1.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(g1.habit));
                            System.out.println("- isLiked : "+ g1.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+g1.name+" ****\n");
                        }
                        else if(isMatched2)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... ");
                            System.out.println("\n 40% Matched .......... ");
                            System.out.println("\n 60% Matched .............. ");
                            System.out.println("\n 80% Matched ................. ");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g2.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+g2.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+g2.name);
                            System.out.println("- Age : "+g2.age);
                            System.out.println("- Gender : "+g2.gender);
                            System.out.println("- Zodiac Sign : "+g2.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(g2.habit));
                            System.out.println("- isLiked : "+ g2.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+g2.name+" ****\n");
                        }
                        else if(isMatched3)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... ");
                            System.out.println("\n 40% Matched .......... ");
                            System.out.println("\n 60% Matched .............. ");
                            System.out.println("\n 80% Matched ................. ");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g3.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+g3.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+g3.name);
                            System.out.println("- Age : "+g3.age);
                            System.out.println("- Gender : "+g2.gender);
                            System.out.println("- Zodiac Sign : "+g3.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(g3.habit));
                            System.out.println("- isLiked : "+ g3.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+g3.name+" ****\n");
                        }
                        else if(isMatched4)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... ");
                            System.out.println("\n 40% Matched .......... ");
                            System.out.println("\n 60% Matched .............. ");
                            System.out.println("\n 80% Matched ................. ");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g4.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+g4.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+g4.name);
                            System.out.println("- Age : "+g4.age);
                            System.out.println("- Gender : "+g4.gender);
                            System.out.println("- Zodiac Sign : "+g4.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(g4.habit));
                            System.out.println("- isLiked : "+ g4.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+g4.name+" ****\n");
                        }
                        else if(isMatched5)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... ");
                            System.out.println("\n 40% Matched .......... ");
                            System.out.println("\n 60% Matched .............. ");
                            System.out.println("\n 80% Matched ................. ");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g5.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+g5.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+g5.name);
                            System.out.println("- Age : "+g5.age);
                            System.out.println("- Gender : "+g5.gender);
                            System.out.println("- Zodiac Sign : "+g5.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(g5.habit));
                            System.out.println("- isLiked : "+ g5.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+g5.name+" ****\n");
                        }
                        else if(isMatched6)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... ");
                            System.out.println("\n 40% Matched .......... ");
                            System.out.println("\n 60% Matched .............. ");
                            System.out.println("\n 80% Matched ................. ");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g6.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+g6.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+g6.name);
                            System.out.println("- Age : "+g6.age);
                            System.out.println("- Gender : "+g6.gender);
                            System.out.println("- Zodiac Sign : "+g6.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(g6.habit));
                            System.out.println("- isLiked : "+ g6.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+g6.name+" ****\n");
                        }
                        else if(isMatched7)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... ");
                            System.out.println("\n 40% Matched .......... ");
                            System.out.println("\n 60% Matched .............. ");
                            System.out.println("\n 80% Matched ................. ");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g7.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+g7.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+g7.name);
                            System.out.println("- Age : "+g7.age);
                            System.out.println("- Gender : "+g7.gender);
                            System.out.println("- Zodiac Sign : "+g7.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(g7.habit));
                            System.out.println("- isLiked : "+ g7.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+g7.name+" ****\n");
                        }
                        else if(isMatched8)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... ");
                            System.out.println("\n 40% Matched .......... ");
                            System.out.println("\n 60% Matched .............. ");
                            System.out.println("\n 80% Matched ................. ");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g8.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+g8.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+g8.name);
                            System.out.println("- Age : "+g8.age);
                            System.out.println("- Gender : "+g8.gender);
                            System.out.println("- Zodiac Sign : "+g8.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(g8.habit));
                            System.out.println("- isLiked : "+ g8.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+g8.name+" ****\n");
                        }
                        else if(isMatched9)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... ");
                            System.out.println("\n 40% Matched .......... ");
                            System.out.println("\n 60% Matched .............. ");
                            System.out.println("\n 80% Matched ................. ");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g9.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+g9.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+g9.name);
                            System.out.println("- Age : "+g9.age);
                            System.out.println("- Gender : "+g9.gender);
                            System.out.println("- Zodiac Sign : "+g9.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(g9.habit));
                            System.out.println("- isLiked : "+ g9.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+g9.name+" ****\n");
                        }
                        else if(isMatched10)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... ");
                            System.out.println("\n 40% Matched .......... ");
                            System.out.println("\n 60% Matched .............. ");
                            System.out.println("\n 80% Matched ................. ");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g10.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+g10.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+g10.name);
                            System.out.println("- Age : "+g10.age);
                            System.out.println("- Gender : "+g10.gender);
                            System.out.println("- Zodiac Sign : "+g10.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(g10.habit));
                            System.out.println("- isLiked : "+ g10.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+g10.name+" ****\n");
                        }
                        else if(isMatched11)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... ");
                            System.out.println("\n 40% Matched .......... ");
                            System.out.println("\n 60% Matched .............. ");
                            System.out.println("\n 80% Matched ................. ");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g11.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+g11.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+g11.name);
                            System.out.println("- Age : "+g11.age);
                            System.out.println("- Gender : "+g11.gender);
                            System.out.println("- Zodiac Sign : "+g11.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(g11.habit));
                            System.out.println("- isLiked : "+ g11.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+g11.name+" ****\n");
                        }
                        else if(isMatched12)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... ");
                            System.out.println("\n 40% Matched .......... ");
                            System.out.println("\n 60% Matched .............. ");
                            System.out.println("\n 80% Matched ................. ");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g12.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+g12.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+g12.name);
                            System.out.println("- Age : "+g12.age);
                            System.out.println("- Gender : "+g12.gender);
                            System.out.println("- Zodiac Sign : "+g12.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(g12.habit));
                            System.out.println("- isLiked : "+ g12.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+g12.name+" ****\n");
                        }
                        else if(isMatched13)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... ");
                            System.out.println("\n 40% Matched .......... ");
                            System.out.println("\n 60% Matched .............. ");
                            System.out.println("\n 80% Matched ................. ");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g13.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+g13.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+g13.name);
                            System.out.println("- Age : "+g13.age);
                            System.out.println("- Gender : "+g13.gender);
                            System.out.println("- Zodiac Sign : "+g13.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(g13.habit));
                            System.out.println("- isLiked : "+ g13.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+g13.name+" ****\n");
                        }
                        else if(isMatched14)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... ");
                            System.out.println("\n 40% Matched .......... ");
                            System.out.println("\n 60% Matched .............. ");
                            System.out.println("\n 80% Matched ................. ");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g14.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+g14.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+g14.name);
                            System.out.println("- Age : "+g14.age);
                            System.out.println("- Gender : "+g14.gender);
                            System.out.println("- Zodiac Sign : "+g14.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(g14.habit));
                            System.out.println("- isLiked : "+ g14.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+g14.name+" ****\n");
                        }
                        else if(isMatched15)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... ");
                            System.out.println("\n 40% Matched .......... ");
                            System.out.println("\n 60% Matched .............. ");
                            System.out.println("\n 80% Matched ................. ");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g15.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+g15.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+g15.name);
                            System.out.println("- Age : "+g15.age);
                            System.out.println("- Gender : "+g15.gender);
                            System.out.println("- Zodiac Sign : "+g15.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(g15.habit));
                            System.out.println("- isLiked : "+ g15.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+g15.name+" ****\n");
                        }
                        else if(isMatched16)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... ");
                            System.out.println("\n 40% Matched .......... ");
                            System.out.println("\n 60% Matched .............. ");
                            System.out.println("\n 80% Matched ................. ");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+g16.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+g16.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+g16.name);
                            System.out.println("- Age : "+g16.age);
                            System.out.println("- Gender : "+g16.gender);
                            System.out.println("- Zodiac Sign : "+g16.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(g16.habit));
                            System.out.println("- isLiked : "+ g16.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+g16.name+" ****\n");
                        }
                        else {
                            System.out.println("💔💔💔 Soulmate Not Found 😔😔😔");
                            System.out.println("\n💔💔💔💔💔 Atmost 40% of your profile matched with The Females Profiles - Not 100% 😔😔😔😔😔 ");
                        }
                    }
                }
                else if(Objects.equals(ud.getGender(), "female"))
                {
                    System.out.println("\n ********** 💘💘 Choose the Male You want to Marry With 💘💘 ************");

                    System.out.println("\n- Name : "+b1.name);
                    System.out.println("- Age : "+b1.age);
                    System.out.println("- Gender : "+b1.gender);
                    System.out.println("- ZodiacSign : "+b1.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(b1.habit));
                    System.out.println("- isLiked You : "+b1.isLiked);
                    System.out.println("- Unique Identifier : "+b1.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("\n- Name : "+b9.name);
                    System.out.println("- Age : "+b9.age);
                    System.out.println("- Gender : "+b9.gender);
                    System.out.println("- ZodiacSign : "+b9.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(b9.habit));
                    System.out.println("- isLiked You : "+b9.isLiked);
                    System.out.println("- Unique Identifier : "+b9.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("\n- Name : "+b2.name);
                    System.out.println("- Age : "+b2.age);
                    System.out.println("- Gender : "+b2.gender);
                    System.out.println("- ZodiacSign : "+b2.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(b2.habit));
                    System.out.println("- isLiked You : "+b2.isLiked);
                    System.out.println("- Unique Identifier : "+b2.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("\n- Name : "+b10.name);
                    System.out.println("- Age : "+b10.age);
                    System.out.println("- Gender : "+b10.gender);
                    System.out.println("- ZodiacSign : "+b10.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(b10.habit));
                    System.out.println("- isLiked You : "+b10.isLiked);
                    System.out.println("- Unique Identifier : "+b10.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("\n- Name : "+b3.name);
                    System.out.println("- Age : "+b3.age);
                    System.out.println("- Gender : "+b3.gender);
                    System.out.println("- ZodiacSign : "+b3.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(b3.habit));
                    System.out.println("- isLiked You : "+b3.isLiked);
                    System.out.println("- Unique Identifier : "+b3.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("\n- Name : "+b11.name);
                    System.out.println("- Age : "+b11.age);
                    System.out.println("- Gender : "+b11.gender);
                    System.out.println("- ZodiacSign : "+b11.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(b11.habit));
                    System.out.println("- isLiked You : "+b11.isLiked);
                    System.out.println("- Unique Identifier : "+b11.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("\n- Name : "+b4.name);
                    System.out.println("- Age : "+b4.age);
                    System.out.println("- Gender : "+b4.gender);
                    System.out.println("- ZodiacSign : "+b4.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(b4.habit));
                    System.out.println("- isLiked You : "+b4.isLiked);
                    System.out.println("- Unique Identifier : "+b4.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("\n- Name : "+b12.name);
                    System.out.println("- Age : "+b12.age);
                    System.out.println("- Gender : "+b12.gender);
                    System.out.println("- ZodiacSign : "+b12.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(b12.habit));
                    System.out.println("- isLiked You : "+b12.isLiked);
                    System.out.println("- Unique Identifier : "+b12.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("\n- Name : "+b5.name);
                    System.out.println("- Age : "+b5.age);
                    System.out.println("- Gender : "+b5.gender);
                    System.out.println("- ZodiacSign : "+b5.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(b5.habit));
                    System.out.println("- isLiked You : "+b5.isLiked);
                    System.out.println("- Unique Identifier : "+b5.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("\n- Name : "+b13.name);
                    System.out.println("- Age : "+b13.age);
                    System.out.println("- Gender : "+b13.gender);
                    System.out.println("- ZodiacSign : "+b13.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(b13.habit));
                    System.out.println("- isLiked You : "+b13.isLiked);
                    System.out.println("- Unique Identifier : "+b13.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("\n- Name : "+b6.name);
                    System.out.println("- Age : "+b6.age);
                    System.out.println("- Gender : "+b6.gender);
                    System.out.println("- ZodiacSign : "+b6.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(b6.habit));
                    System.out.println("- isLiked You : "+b6.isLiked);
                    System.out.println("- Unique Identifier : "+b6.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("\n- Name : "+b14.name);
                    System.out.println("- Age : "+b14.age);
                    System.out.println("- Gender : "+b14.gender);
                    System.out.println("- ZodiacSign : "+b14.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(b14.habit));
                    System.out.println("- isLiked You : "+b14.isLiked);
                    System.out.println("- Unique Identifier : "+b14.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("\n- Name : "+b7.name);
                    System.out.println("- Age : "+b7.age);
                    System.out.println("- Gender : "+b7.gender);
                    System.out.println("- ZodiacSign : "+b7.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(b7.habit));
                    System.out.println("- isLiked You : "+b7.isLiked);
                    System.out.println("- Unique Identifier : "+b7.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("\n- Name : "+b15.name);
                    System.out.println("- Age : "+b15.age);
                    System.out.println("- Gender : "+b15.gender);
                    System.out.println("- ZodiacSign : "+b15.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(b15.habit));
                    System.out.println("- isLiked You : "+b15.isLiked);
                    System.out.println("- Unique Identifier : "+b15.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("\n- Name : "+b8.name);
                    System.out.println("- Age : "+b8.age);
                    System.out.println("- Gender : "+b8.gender);
                    System.out.println("- ZodiacSign : "+b8.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(b8.habit));
                    System.out.println("- isLiked You : "+b8.isLiked);
                    System.out.println("- Unique Identifier : "+b8.id);

                    System.out.println("\n*********************************\n");

                    System.out.println("\n- Name : "+b16.name);
                    System.out.println("- Age : "+b16.age);
                    System.out.println("- Gender : "+b16.gender);
                    System.out.println("- ZodiacSign : "+b16.zodiacSign);
                    System.out.println("- Habit : "+ Arrays.toString(b16.habit));
                    System.out.println("- isLiked You : "+b16.isLiked);
                    System.out.println("- Unique Identifier : "+b16.id);

                    System.out.println("\n 💝💝💝💝💝💝 Choose the Male based on their **** Unique Identifier **** to get marry , 💔💔💔💔💔 Or click *** 0 *** if you not like any of them :- ");
                    int choice = sc.nextInt();
                    System.out.println("Your choice :- "+choice);

                    if(choice != 0)
                    {
                        switch (choice)
                        {
                            case 1:
                            {
//                            System.out.println("\n(Arrays.equals(b1.habit, habits)) :- "+(Arrays.equals(b1.habit, habits)));
//                            System.out.println("(b1.zodiacSign.equals(ud.getZodiacSign())) :- "+(b1.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(b1.habit,habits)) && (b1.zodiacSign.equals(ud.getZodiacSign())) && b1.isLiked)
                                {
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b1.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+b1.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+b1.name);
                                    System.out.println("- Age : "+b1.age);
                                    System.out.println("- Gender : "+b1.gender);
                                    System.out.println("- Zodiac Sign : "+b1.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(b1.habit));
                                    System.out.println("- isLiked : "+ b1.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+b1.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 30% match with " + b1.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + b1.name + " **** at this time.");
                                }
                            }
                            break;

                            case 2:
                            {
                                if((Arrays.equals(b9.habit,habits)) && (b9.zodiacSign.equals(ud.getZodiacSign())) && b9.isLiked)
                                {
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b9.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+b9.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+b9.name);
                                    System.out.println("- Age : "+b9.age);
                                    System.out.println("- Gender : "+b9.gender);
                                    System.out.println("- Zodiac Sign : "+b9.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(b9.habit));
                                    System.out.println("- isLiked : "+ b9.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+b9.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 30% match with " + b9.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + b9.name + " **** at this time.");
                                }
                            }
                            break;

                            case 3:
                            {
                                if((Arrays.equals(b2.habit,habits)) && (b2.zodiacSign.equals(ud.getZodiacSign())) && b2.isLiked)
                                {
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b2.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+b2.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+b2.name);
                                    System.out.println("- Age : "+b2.age);
                                    System.out.println("- Gender : "+b2.gender);
                                    System.out.println("- Zodiac Sign : "+b2.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(b2.habit));
                                    System.out.println("- isLiked : "+ b2.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+b2.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 40% match with " + b2.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + b2.name + " **** at this time.");
                                }
                            }
                            break;

                            case 4:
                            {
                                if((Arrays.equals(b10.habit,habits)) && (b10.zodiacSign.equals(ud.getZodiacSign())) && b10.isLiked)
                                {
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b10.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+b10.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+b10.name);
                                    System.out.println("- Age : "+b10.age);
                                    System.out.println("- Gender : "+b10.gender);
                                    System.out.println("- Zodiac Sign : "+b10.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(b10.habit));
                                    System.out.println("- isLiked : "+ b10.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+b10.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 45% match with " + b10.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + b10.name + " **** at this time.");
                                }
                            }
                            break;

                            case 5:
                            {
                                if((Arrays.equals(b3.habit,habits)) && (b3.zodiacSign.equals(ud.getZodiacSign())) && b3.isLiked)
                                {
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b3.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+b3.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+b3.name);
                                    System.out.println("- Age : "+b3.age);
                                    System.out.println("- Gender : "+b3.gender);
                                    System.out.println("- Zodiac Sign : "+b3.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(b3.habit));
                                    System.out.println("- isLiked : "+ b3.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+b3.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 28% match with " + b3.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + b3.name + " **** at this time.");
                                }
                            }
                            break;

                            case 6:
                            {
                                if((Arrays.equals(b11.habit,habits)) && (b11.zodiacSign.equals(ud.getZodiacSign())) && b11.isLiked)
                                {
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b11.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+b11.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+b11.name);
                                    System.out.println("- Age : "+b11.age);
                                    System.out.println("- Gender : "+b11.gender);
                                    System.out.println("- Zodiac Sign : "+b11.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(b11.habit));
                                    System.out.println("- isLiked : "+ b11.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+b11.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 28% match with " + b11.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + b11.name + " **** at this time.");
                                }
                            }
                            break;

                            case 7:
                            {
//                            System.out.println("\n(Arrays.equals(g4.habit, habits)) :- "+(Arrays.equals(g4.habit, habits)));
//                            System.out.println("(g4.zodiacSign.equals(ud.getZodiacSign())) :- "+(g4.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(b4.habit,habits)) && (b4.zodiacSign.equals(ud.getZodiacSign())) && b4.isLiked)
                                {
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b4.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+b4.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+b4.name);
                                    System.out.println("- Age : "+b4.age);
                                    System.out.println("- Gender : "+b4.gender);
                                    System.out.println("- Zodiac Sign : "+b4.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(b4.habit));
                                    System.out.println("- isLiked : "+ b4.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+b4.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 25% match with " + b4.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + b4.name + " **** at this time.");
                                }
                            }
                            break;

                            case 8:
                            {
//                            System.out.println("\n(Arrays.equals(g12.habit, habits)) :- "+(Arrays.equals(g12.habit, habits)));
//                            System.out.println("(g12.zodiacSign.equals(ud.getZodiacSign())) :- "+(g12.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(b12.habit,habits)) && (b12.zodiacSign.equals(ud.getZodiacSign())) && b12.isLiked)
                                {
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b12.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+b12.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+b12.name);
                                    System.out.println("- Age : "+b12.age);
                                    System.out.println("- Gender : "+b12.gender);
                                    System.out.println("- Zodiac Sign : "+b12.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(b12.habit));
                                    System.out.println("- isLiked : "+ b12.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+b12.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 35% match with " + b12.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + b12.name + " **** at this time.");
                                }
                            }
                            break;

                            case 9:
                            {
//                            System.out.println("\n(Arrays.equals(g5.habit, habits)) :- "+(Arrays.equals(g5.habit, habits)));
//                            System.out.println("(g5.zodiacSign.equals(ud.getZodiacSign())) :- "+(g5.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(b5.habit,habits)) && (b5.zodiacSign.equals(ud.getZodiacSign())) && b5.isLiked)
                                {
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b5.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+b5.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+b5.name);
                                    System.out.println("- Age : "+b5.age);
                                    System.out.println("- Gender : "+b5.gender);
                                    System.out.println("- Zodiac Sign : "+b5.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(b5.habit));
                                    System.out.println("- isLiked : "+ b5.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+b5.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 49% match with " + b5.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + b5.name + " **** at this time.");
                                }
                            }
                            break;

                            case 10:
                            {
//                            System.out.println("\n(Arrays.equals(g13.habit, habits)) :- "+(Arrays.equals(g13.habit, habits)));
//                            System.out.println("(g13.zodiacSign.equals(ud.getZodiacSign())) :- "+(g13.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(b13.habit,habits)) && (b13.zodiacSign.equals(ud.getZodiacSign())) && b13.isLiked)
                                {
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b13.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+b13.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+b13.name);
                                    System.out.println("- Age : "+b13.age);
                                    System.out.println("- Gender : "+b13.gender);
                                    System.out.println("- Zodiac Sign : "+b13.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(b13.habit));
                                    System.out.println("- isLiked : "+ b13.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+b13.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 35% match with " + b13.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + b13.name + " **** at this time.");
                                }
                            }
                            break;

                            case 11:
                            {
//                            System.out.println("\n(Arrays.equals(g6.habit, habits)) :- "+(Arrays.equals(g6.habit, habits)));
//                            System.out.println("(g6.zodiacSign.equals(ud.getZodiacSign())) :- "+(g6.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(b6.habit,habits)) && (b6.zodiacSign.equals(ud.getZodiacSign())) && b6.isLiked)
                                {
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b6.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+b6.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+b6.name);
                                    System.out.println("- Age : "+b6.age);
                                    System.out.println("- Gender : "+b6.gender);
                                    System.out.println("- Zodiac Sign : "+b6.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(b6.habit));
                                    System.out.println("- isLiked : "+ b6.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+b6.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 35% match with " + b6.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + b6.name + " **** at this time.");
                                }
                            }
                            break;

                            case 12:
                            {
//                            System.out.println("\n(Arrays.equals(g14.habit, habits)) :- "+(Arrays.equals(g14.habit, habits)));
//                            System.out.println("(g14.zodiacSign.equals(ud.getZodiacSign())) :- "+(g14.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(b14.habit,habits)) && (b14.zodiacSign.equals(ud.getZodiacSign())) && b14.isLiked)
                                {
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b14.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+b14.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+b14.name);
                                    System.out.println("- Age : "+b14.age);
                                    System.out.println("- Gender : "+b14.gender);
                                    System.out.println("- Zodiac Sign : "+b14.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(b14.habit));
                                    System.out.println("- isLiked : "+ b14.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+b14.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 54% match with " + b14.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + b14.name + " **** at this time.");
                                }
                            }
                            break;

                            case 13:
                            {
//                            System.out.println("\n(Arrays.equals(g7.habit, habits)) :- "+(Arrays.equals(g7.habit, habits)));
//                            System.out.println("(g7.zodiacSign.equals(ud.getZodiacSign())) :- "+(g7.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(b7.habit,habits)) && (b7.zodiacSign.equals(ud.getZodiacSign())) && b7.isLiked)
                                {
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b7.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+b7.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+b7.name);
                                    System.out.println("- Age : "+b7.age);
                                    System.out.println("- Gender : "+b7.gender);
                                    System.out.println("- Zodiac Sign : "+b7.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(b7.habit));
                                    System.out.println("- isLiked : "+ b7.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+b7.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 35% match with " + b7.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + b7.name + " **** at this time.");
                                }
                            }
                            break;

                            case 14:
                            {
//                            System.out.println("\n(Arrays.equals(g15.habit, habits)) :- "+(Arrays.equals(g15.habit, habits)));
//                            System.out.println("(g15.zodiacSign.equals(ud.getZodiacSign())) :- "+(g15.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(b15.habit,habits)) && (b15.zodiacSign.equals(ud.getZodiacSign())) && b15.isLiked)
                                {
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b15.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+b15.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+b15.name);
                                    System.out.println("- Age : "+b15.age);
                                    System.out.println("- Gender : "+b15.gender);
                                    System.out.println("- Zodiac Sign : "+b15.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(b15.habit));
                                    System.out.println("- isLiked : "+ b15.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+b15.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 55% match with " + b15.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + b15.name + " **** at this time.");
                                }
                            }
                            break;

                            case 15:
                            {
//                            System.out.println("\n(Arrays.equals(g8.habit, habits)) :- "+(Arrays.equals(g8.habit, habits)));
//                            System.out.println("(g8.zodiacSign.equals(ud.getZodiacSign())) :- "+(g8.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(b8.habit,habits)) && (b8.zodiacSign.equals(ud.getZodiacSign())) && b8.isLiked)
                                {
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b8.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+b8.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+b8.name);
                                    System.out.println("- Age : "+b8.age);
                                    System.out.println("- Gender : "+b8.gender);
                                    System.out.println("- Zodiac Sign : "+b8.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(b8.habit));
                                    System.out.println("- isLiked : "+ b8.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+b8.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 44% match with " + b8.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + b8.name + " **** at this time.");
                                }
                            }
                            break;

                            case 16:
                            {
//                            System.out.println("\n(Arrays.equals(g16.habit, habits)) :- "+(Arrays.equals(g16.habit, habits)));
//                            System.out.println("(g16.zodiacSign.equals(ud.getZodiacSign())) :- "+(g16.zodiacSign.equals(ud.getZodiacSign())));

                                if((Arrays.equals(b16.habit,habits)) && (b16.zodiacSign.equals(ud.getZodiacSign())) && b16.isLiked)
                                {
                                    System.out.println("\n 20% Matched ...... ");
                                    System.out.println("\n 40% Matched .......... ");
                                    System.out.println("\n 60% Matched .............. ");
                                    System.out.println("\n 80% Matched ................. ");
                                    System.out.println("\n 100% Matched ................... \n");

                                    System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                                    System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b16.name+ " 🤩🤩🤩🥰🥰💖💖");

                                    System.out.println("\n------------------------ Look below for more Details about - *** "+b16.name+" *** ------------------------------------------- \n");

                                    System.out.println("- Name : "+b16.name);
                                    System.out.println("- Age : "+b16.age);
                                    System.out.println("- Gender : "+b16.gender);
                                    System.out.println("- Zodiac Sign : "+b16.zodiacSign);
                                    System.out.println("- Habits : "+ Arrays.toString(b16.habit));
                                    System.out.println("- isLiked : "+ b16.isLiked);

                                    System.out.println("\n 💚💚💚💚 You can send Request to **** "+b16.name+" ****\n");
                                }
                                else
                                {
                                    System.out.println("\nProfile Compatibility: 31% match with " + b16.name + ".");
                                    System.out.println("We regret to inform you that your profile does not meet the requirements for a full match with **** " + b16.name + " **** at this time.");
                                }
                            }
                            break;

                            default:
                            {
                                System.out.println("😑😑😑😑 Out of range - Kindly enter appropriate Unique Identifier 😑😑😑😑");
                                break;
                            }
                        }
                    }
                    else
                    {

                        String zodiacSignOfUser = ud.getZodiacSign();
                        boolean isMatched1 = IamTheMatcherForMales.userMatchWithB1(habits,zodiacSignOfUser);
                        boolean isMatched2 = IamTheMatcherForMales.userMatchWithB2(habits,zodiacSignOfUser);
                        boolean isMatched3 = IamTheMatcherForMales.userMatchWithB3(habits,zodiacSignOfUser);
                        boolean isMatched4 = IamTheMatcherForMales.userMatchWithB4(habits,zodiacSignOfUser);
                        boolean isMatched5 = IamTheMatcherForMales.userMatchWithB5(habits,zodiacSignOfUser);
                        boolean isMatched6 = IamTheMatcherForMales.userMatchWithB6(habits,zodiacSignOfUser);
                        boolean isMatched7 = IamTheMatcherForMales.userMatchWithB7(habits,zodiacSignOfUser);
                        boolean isMatched8 = IamTheMatcherForMales.userMatchWithB8(habits,zodiacSignOfUser);
                        boolean isMatched9 = IamTheMatcherForMales.userMatchWithB9(habits,zodiacSignOfUser);
                        boolean isMatched10 = IamTheMatcherForMales.userMatchWithB10(habits,zodiacSignOfUser);
                        boolean isMatched11 = IamTheMatcherForMales.userMatchWithB11(habits,zodiacSignOfUser);
                        boolean isMatched12 = IamTheMatcherForMales.userMatchWithB2(habits,zodiacSignOfUser);
                        boolean isMatched13 = IamTheMatcherForMales.userMatchWithB13(habits,zodiacSignOfUser);
                        boolean isMatched14 = IamTheMatcherForMales.userMatchWithB14(habits,zodiacSignOfUser);
                        boolean isMatched15 = IamTheMatcherForMales.userMatchWithB15(habits,zodiacSignOfUser);
                        boolean isMatched16 = IamTheMatcherForMales.userMatchWithB16(habits,zodiacSignOfUser);
                        if(isMatched1)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... \n");
                            System.out.println("\n 40% Matched .......... \n");
                            System.out.println("\n 60% Matched .............. \n");
                            System.out.println("\n 80% Matched ................. \n");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b1.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+b1.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+b1.name);
                            System.out.println("- Age : "+b1.age);
                            System.out.println("- Gender : "+b1.gender);
                            System.out.println("- Zodiac Sign : "+b1.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(b1.habit));
                            System.out.println("- isLiked : "+ b1.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+b1.name+" ****\n");
                        }
                        else if(isMatched2)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... \n");
                            System.out.println("\n 40% Matched .......... \n");
                            System.out.println("\n 60% Matched .............. \n");
                            System.out.println("\n 80% Matched ................. \n");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b2.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+b2.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+b2.name);
                            System.out.println("- Age : "+b2.age);
                            System.out.println("- Gender : "+b2.gender);
                            System.out.println("- Zodiac Sign : "+b2.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(b2.habit));
                            System.out.println("- isLiked : "+ b2.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+b2.name+" ****\n");
                        }
                        else if(isMatched3)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... \n");
                            System.out.println("\n 40% Matched .......... \n");
                            System.out.println("\n 60% Matched .............. \n");
                            System.out.println("\n 80% Matched ................. \n");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b3.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+b3.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+b3.name);
                            System.out.println("- Age : "+b3.age);
                            System.out.println("- Gender : "+b3.gender);
                            System.out.println("- Zodiac Sign : "+b3.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(b3.habit));
                            System.out.println("- isLiked : "+ b3.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+b3.name+" ****\n");
                        }
                        else if(isMatched4)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... \n");
                            System.out.println("\n 40% Matched .......... \n");
                            System.out.println("\n 60% Matched .............. \n");
                            System.out.println("\n 80% Matched ................. \n");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b4.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+b4.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+b4.name);
                            System.out.println("- Age : "+b4.age);
                            System.out.println("- Gender : "+b4.gender);
                            System.out.println("- Zodiac Sign : "+b4.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(b4.habit));
                            System.out.println("- isLiked : "+ b4.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+b4.name+" ****\n");
                        }
                        else if(isMatched5)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... \n");
                            System.out.println("\n 40% Matched .......... \n");
                            System.out.println("\n 60% Matched .............. \n");
                            System.out.println("\n 80% Matched ................. \n");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b5.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+b5.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+b5.name);
                            System.out.println("- Age : "+b5.age);
                            System.out.println("- Gender : "+b5.gender);
                            System.out.println("- Zodiac Sign : "+b5.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(b5.habit));
                            System.out.println("- isLiked : "+ b5.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+b5.name+" ****\n");
                        }
                        else if(isMatched6)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... \n");
                            System.out.println("\n 40% Matched .......... \n");
                            System.out.println("\n 60% Matched .............. \n");
                            System.out.println("\n 80% Matched ................. \n");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b6.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+b6.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+b6.name);
                            System.out.println("- Age : "+b6.age);
                            System.out.println("- Gender : "+b6.gender);
                            System.out.println("- Zodiac Sign : "+b6.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(b6.habit));
                            System.out.println("- isLiked : "+ b6.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+b6.name+" ****\n");
                        }
                        else if(isMatched7)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... \n");
                            System.out.println("\n 40% Matched .......... \n");
                            System.out.println("\n 60% Matched .............. \n");
                            System.out.println("\n 80% Matched ................. \n");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b7.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+b7.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+b7.name);
                            System.out.println("- Age : "+b7.age);
                            System.out.println("- Gender : "+b7.gender);
                            System.out.println("- Zodiac Sign : "+b7.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(b7.habit));
                            System.out.println("- isLiked : "+ b7.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+b7.name+" ****\n");
                        }
                        else if(isMatched8)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... \n");
                            System.out.println("\n 40% Matched .......... \n");
                            System.out.println("\n 60% Matched .............. \n");
                            System.out.println("\n 80% Matched ................. \n");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b8.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+b8.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+b8.name);
                            System.out.println("- Age : "+b8.age);
                            System.out.println("- Gender : "+b8.gender);
                            System.out.println("- Zodiac Sign : "+b8.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(b8.habit));
                            System.out.println("- isLiked : "+ b8.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+b8.name+" ****\n");
                        }
                        else if(isMatched9)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... \n");
                            System.out.println("\n 40% Matched .......... \n");
                            System.out.println("\n 60% Matched .............. \n");
                            System.out.println("\n 80% Matched ................. \n");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b9.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+b9.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+b9.name);
                            System.out.println("- Age : "+b9.age);
                            System.out.println("- Gender : "+b9.gender);
                            System.out.println("- Zodiac Sign : "+b9.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(b9.habit));
                            System.out.println("- isLiked : "+ b9.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+b9.name+" ****\n");
                        }
                        else if(isMatched10)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... \n");
                            System.out.println("\n 40% Matched .......... \n");
                            System.out.println("\n 60% Matched .............. \n");
                            System.out.println("\n 80% Matched ................. \n");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b10.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+b10.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+b10.name);
                            System.out.println("- Age : "+b10.age);
                            System.out.println("- Gender : "+b10.gender);
                            System.out.println("- Zodiac Sign : "+b10.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(b10.habit));
                            System.out.println("- isLiked : "+ b10.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+b10.name+" ****\n");
                        }
                        else if(isMatched11)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... \n");
                            System.out.println("\n 40% Matched .......... \n");
                            System.out.println("\n 60% Matched .............. \n");
                            System.out.println("\n 80% Matched ................. \n");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b11.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+b11.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+b11.name);
                            System.out.println("- Age : "+b11.age);
                            System.out.println("- Gender : "+b11.gender);
                            System.out.println("- Zodiac Sign : "+b11.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(b11.habit));
                            System.out.println("- isLiked : "+ b11.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+b11.name+" ****\n");
                        }
                        else if(isMatched12)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... \n");
                            System.out.println("\n 40% Matched .......... \n");
                            System.out.println("\n 60% Matched .............. \n");
                            System.out.println("\n 80% Matched ................. \n");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b12.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+b12.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+b12.name);
                            System.out.println("- Age : "+b12.age);
                            System.out.println("- Gender : "+b12.gender);
                            System.out.println("- Zodiac Sign : "+b12.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(b12.habit));
                            System.out.println("- isLiked : "+ b12.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+b12.name+" ****\n");
                        }
                        else if(isMatched13)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... \n");
                            System.out.println("\n 40% Matched .......... \n");
                            System.out.println("\n 60% Matched .............. \n");
                            System.out.println("\n 80% Matched ................. \n");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b13.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+b13.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+b13.name);
                            System.out.println("- Age : "+b13.age);
                            System.out.println("- Gender : "+b13.gender);
                            System.out.println("- Zodiac Sign : "+b13.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(b13.habit));
                            System.out.println("- isLiked : "+ b13.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+b13.name+" ****\n");
                        }
                        else if(isMatched14)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... \n");
                            System.out.println("\n 40% Matched .......... \n");
                            System.out.println("\n 60% Matched .............. \n");
                            System.out.println("\n 80% Matched ................. \n");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b14.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+b14.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+b14.name);
                            System.out.println("- Age : "+b14.age);
                            System.out.println("- Gender : "+b14.gender);
                            System.out.println("- Zodiac Sign : "+b14.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(b14.habit));
                            System.out.println("- isLiked : "+ b14.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+b14.name+" ****\n");
                        }
                        else if(isMatched15)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... \n");
                            System.out.println("\n 40% Matched .......... \n");
                            System.out.println("\n 60% Matched .............. \n");
                            System.out.println("\n 80% Matched ................. \n");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b15.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+b15.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+b15.name);
                            System.out.println("- Age : "+b15.age);
                            System.out.println("- Gender : "+b15.gender);
                            System.out.println("- Zodiac Sign : "+b15.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(b15.habit));
                            System.out.println("- isLiked : "+ b15.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+b15.name+" ****\n");
                        }
                        else if(isMatched16)
                        {
                            System.out.println("\n🔃🔃🔃🔃 Matching Your Profile..........\n");
                            System.out.println("\n 20% Matched ...... \n");
                            System.out.println("\n 40% Matched .......... \n");
                            System.out.println("\n 60% Matched .............. \n");
                            System.out.println("\n 80% Matched ................. \n");
                            System.out.println("\n 100% Matched ................... \n");

                            System.out.println("💖💖💖💖 Below is your Soulmate's Detailed information 👇👇👇👇");

                            System.out.println("\n💘💘💘💘 Congratulation profile successfully matched with "+b16.name+ " 🤩🤩🤩🥰🥰💖💖");

                            System.out.println("\n------------------------ Look below for more Details about - *** "+b16.name+" *** ------------------------------------------- \n");

                            System.out.println("- Name : "+b16.name);
                            System.out.println("- Age : "+b16.age);
                            System.out.println("- Gender : "+b16.gender);
                            System.out.println("- Zodiac Sign : "+b16.zodiacSign);
                            System.out.println("- Habits : "+ Arrays.toString(b16.habit));
                            System.out.println("- isLiked : "+ b16.isLiked);

                            System.out.println("\n 💚💚💚💚 You can send Request to **** "+b16.name+" ****\n");
                        }
                        else {
                            System.out.println("💔💔💔 Soulmate Not Found 😔😔😔");
                            System.out.println("\n💔💔💔💔💔 Atmost 41% of your profile matched with The Males Profiles - Not 100% 😔😔😔😔😔 ");
                        }
                    }
                }
                else
                {
                    System.out.println("\n🤨🤨🤔🤔🤔🤨 *********** 404 Not Found - Kuch to Gadbad Hai *********** 🤨🤨🤨🤐🤐🤐");
                }
            }
        catch(Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
