package choose.your.own.adventure_steven.jin;

import java.util.Scanner;

/**author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/10/10
 * Brief instruction: This program is a "Choose Your Own Adventure" game, which
 *                    mimic that protagonist faces two or three options, each of
 *                    which leads to more options, and then to one of many endings.
 */

public class ChooseYourOwnAdventure_StevenJin {

    
    public static void scene1()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to Lost In Jokul.");
        System.out.println("\nDear adventure, you and your frined Tony are tryig "
                + "\nto climb Alps. However, unfortunetly, you encountered "
                + "\nan unpredictable storm, and you cannot find your friend "
                + "\nand get a injure (not very intensive but definitely hurt) "
                + "\non your leg which may influence your moving speed and need "
                + "\nformative treatment within a day. Your frined is a surgeon "
                + "\nand owned a first aid bag and also have enough food supply "
                + "which can sustain living for days. What have left in your bag is 2 "
                + "\nbottols"
                + "\n of drink water, 3 pieces of compressed biscuits,(food "
                + "\nand drink can support walking for 3 hours and stay for 5 hours)"
                + "\nsufficient clothes, a compass, an electric torch, a high "
                + "\nfrequency signal trainsmitter, and a climbing rope which can "
                + "\ncontainsweight no more that 1 person.\n\nYou have two choices:"
                + "\n1.Wait for your friend right here.\n2.Go and find your friend.");
        System.out.print("press 1 or 2: ");
        int choice1 = input.nextInt();
        if (choice1==1)
        {scene1_1();}
        else if (choice1==2)
        {scene1_2();}
        else
        System.out.println("Invalid input");
    }
    
   public static void scene1_1()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("\nWait for your friend right here\n\nthree hours past, "
                + "\nyour friend still did't came, and your leg's injure became "
                + "\nworse and hard to insist.\n\nYou have two choices:\n3.Wait "
                + "for another 1 hour.\n4.Go and find your friend now.");
        System.out.print("press 3 or 4: ");
            int choice2 = input.nextInt();
            if (choice2==3)
            {System.out.println("\nAnother hour is past, your food supply can only "
                    + "\ncontains for 1 hour wait and 36 mintues walk. Your lose "
                    + "the aibility for finding friends. It is time to fight for "
                    + "\nliving for youself, but remeber, you only have 1 hour "
                    + "\nunless you can find helper. You have three choices:\n7."
                    + "Use electric torch for catching other's attention.\n8.use "
                    + "high frequency signal trainsmitter trying to connect signal "
                    + "station and welfare organization.\n9.Use climbing rope "
                    + "trying to get down the montain to a place where helpers rest.");
              System.out.print("press 7, 8 or 9: ");
                    int choice4 = input.nextInt();
                    if(choice4==7)
                     {System.out.println("\nUse electric torch\n\nFortunetly, a "
                             + "\nhelicopter came and pick you up. You are alive, "
                             + "\nbut you lose your best friends. One week later, "
                             + "\nyou are recovered and attend your friend's funeral.");}
                    else if(choice4==8)
                     {System.out.println("\nUse high frequency signal trainsmitter"
                             + "\n\nFortunetly, the station rieve your SOS and send a "
                             + "\nhelicopter to pick you up and send you to hospital. "
                             + "\nYou are alive, but you lose your best friends. "
                             + "\nOne week later, you are recovered and attend "
                             + "\nyour friend's funeral.");}
                    else if(choice4==9)
                     {System.out.println("\nUse climbing rope\n\nyour energy end "
                             + "\nand you cannot hold your weight and fall down "
                             + "\nalong the mountain. Although somebody find you "
                             + "\nafterward and send you to hospital, you died "
                             + "\nbecause of carniocerebral injury and bone feacture. "
                             + "\nYou friend died in the hole and nobody ever find him.");}
                    else
                    {System.out.println("Invalid input");}
            }
            else if(choice2==4)
            {System.out.println("\nGo and find your friend\n\nAnother hour is past, you find your "
                + "\nfriend in a big hole and still have awareness but unknow "
                + "\ndegree of hurt. You can clearly heard that he calls your "
                + "\nname, but he cannot go out by his own and so do you if you "
                + "\njump into the hole.\n\nYou have two choices:\n5.try to use "
                + "rope to pull him up.\n6.Give up you friend and try to go down "
                + "the montain or ask for help by yourself");}
            else
            {System.out.println("Invalid input");}
        }
    
    public static void scene1_2()
    {
            Scanner input=new Scanner(System.in);
            System.out.print("\nGo and find your friend\n\n1 hours past,you find your "
                + "\nfriend in a big hole and still have awareness but unknow "
                + "\ndegree of hurt. You can clearly heard that he calls your "
                + "\nname, but he cannot go out by his own and so do you if you "
                + "\njump into the hole.\n\nYou have two choices:\n5.try to use "
                + "rope to pull him up.\n6.Give up you friend and try to go down "
                + "the montain or ask for help by yourself");
            System.out.print("\npress 5 or 6: ");
            int choice3 = input.nextInt();
            if (choice3==5)
            {System.out.print("\nTry to use rope to pull him up.\n\nYou use 5 "
                    + "\nminute to pull up your friend friend, and he just have "
                    + "\nsome small injure and then he help you to treat your leg."
                    + "\nYouand your friend need to find way to go down the mountain "
                    + "\nwith unlimited time. \nYou have three choices:\n10."
                    + "Use electric torch for catching other's attention.\n11.use "
                    + "high frequency signal trainsmitter trying to connect signal "
                    + "station and welfare organization.\n12.Use climbing rope "
                    + "trying to get down the montain to a place where helpers rest.");
            System.out.print("press 10, 11 or 12: ");
                    int choice5 = input.nextInt();
                    if(choice5==10)
                     {System.out.println("\nUse electric torch\n\nFortunetly, a "
                             + "\nhelicopter came and pick you up. You and your "
                             + "\nfriend are both alive");}
                    else if(choice5==11)
                     {System.out.println("\nUse high frequency signal trainsmitter"
                             + "\n\nFortunetly, the station rieve your SOS and send a "
                             + "\nhelicopter to pick you up and send you to hospital. "
                             + "\nYou and your friend are both alive");}
                    else if(choice5==12)
                     {System.out.println("\nUse climbing rope\n\nYou and your friend "
                             + "\nsuccessful way back to base and are send to hosital"
                             + "\nby others and recovered soon");}
            }
            else if(choice3==6)
            {System.out.println("\nGive up your friend\n\nIt is time to fight for "
                    + "\nliving for youself, but remeber, you only have 1 hour "
                    + "\nunless you can find helper. You have three choices:\n13."
                    + "Use electric torch for catching other's attention.\n14.use "
                    + "high frequency signal trainsmitter trying to connect signal "
                    + "station and welfare organization.\n15.Use climbing rope "
                    + "trying to get down the montain to a place where helpers rest.");
              System.out.print("press 13, 14 or 15: ");
                    int choice6 = input.nextInt();
                    if(choice6==13)
                     {System.out.println("\nUse electric torch\n\nFortunetly, a "
                             + "\nhelicopter came and pick you up. You are alive, "
                             + "\nbut you lose your best friends. One week later, "
                             + "\nyou are recovered and attend your friend's funeral");}
                    else if(choice6==14)
                     {System.out.println("\nUse high frequency signal trainsmitter"
                             + "\n\nFortunetly, the station rieve your SOS and send a "
                             + "\nhelicopter to pick you up and send you to hospital. "
                             + "\nYou are alive, but you lose your best friends. "
                             + "\nOne week later, you are recovered and attend "
                             + "\nyour friend's funeral");}
                    else if(choice6==15)
                     {System.out.println("\nUse climbing rope\n\nyour energy end "
                             + "\nand you cannot hold your weight and fall down "
                             + "\nalong the mountain. Although somebody find you "
                             + "\nafterward and send you to hospital, you died "
                             + "\nbecause of carniocerebral injury and bone feacture. "
                             + "\nYou friend died in the hole and nobody ever find him");}
                    else
                    {System.out.println("Invalid input");}
            }
            else
            {System.out.println("Invalid input");
            }
    }
    
    public static void main(String[] args)
        {
        System.out.println("Welcome to Lost In Jokul.");
        scene1();
        }   
}

    

