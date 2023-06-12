// ELECTRONICS STORE PROGRAM
// A Project by KUSH PATEL

import java.util.*;
import java.util.Date;
public class Electronics_Store
{
    Scanner sc=new Scanner(System.in);
    String nm, nm1;
    int price;
    int sum;
    String pr;
    String cr;
    Date date;
    public void Products()
    {
        long x;
        System.out.println("Welcome To INFINITY ELECTRONICS");
        System.out.println();
        for(x=1;x<=999999999;x++)
        {
            if(x==1)
            {
                System.out.println("Loading... Please Wait");
            }
            if(x==999999999)
            {
                System.out.println("Done");
            }
        }
        System.out.println("\f");
        int ch;
        System.out.println("Welcome To INFINITY ELECTRONICS");
        System.out.println();
        System.out.println("1.  Mobiles");
        System.out.println("2.  Mobiles Accessories");
        System.out.println("3.  TVs");
        System.out.println("4.  TV Accessories");
        System.out.println("5.  Tablets");
        System.out.println("6.  Tablet Accessories");
        System.out.println("7.  Laptops");
        System.out.println("8.  Laptop Accessories");
        System.out.println("9.  Bluetooth Speakers");
        System.out.println("10. Channel Speakers");
        System.out.println("11. Home Theatre System");
        System.out.println("12. Bluetooth Headphones");
        System.out.println("13. Wired Headphones");
        System.out.println("14. Bluetooth Earphones");
        System.out.println("15. Wired Earphones");
        System.out.println("16. Handsfree");
        System.out.println("17. Smart Watch");
        System.out.println("18. Smart Watch Accessories");
        System.out.println("19. Daily Essentials");
        System.out.println("20. Storage Devices");
        System.out.println();
        System.out.println("Enter yor choice (only serial no.)");
        ch=sc.nextInt();
        
        switch(ch)
        {
            case 1:System.out.println("\f");
                    cr="Mobile";
                    Mobiles();
                   break;
                   
            case 2:System.out.println("\f");
                    cr="Mobile Accessories";
                    MobileAccessories();
                   break;
                   
            case 3:System.out.println("\f");
                    cr="TV";
                    TVs();
                   break;
                   
            case 4:System.out.println("\f");
                    cr="TV Accessories";
                    TVAccessories();
                   break;
                   
            case 5:System.out.println("\f");
                    cr="Tablet";
                    Tablets();
                   break;
                   
            case 6:System.out.println("\f");
                    cr="Tablet Accessoires";
                    TabletAccessories();
                   break;
                   
            case 7:System.out.println("\f");
                    cr="Laptop";
                    Laptops();
                   break;
                   
            case 8:System.out.println("\f");
                    cr="Laptop Accessories";
                    LaptopAccessories();
                   break;
                   
            case 9:System.out.println("\f");
                    cr="Bluetooth Speaker";
                    BluetoothSpeakers();
                   break;
                   
            case 10:System.out.println("\f");
                     cr="Channel Speakers";
                     ChannelSpeakers();
                    break;
                    
            case 11:System.out.println("\f");
                     cr="Home Theatre System";
                     HomeTheatreSystem();
                    break;
                    
            case 12:System.out.println("\f");
                     cr="Bluetooth Headphones";
                     BluetoothHeadphones();
                    break;
                    
            case 13:System.out.println("\f");
                     cr="Wired Headphones";
                     WiredHeadphones();
                    break;
                    
            case 14:System.out.println("\f");
                     cr="Bluetooth Earphones";
                     BluetoothEarphones();
                    break;
                    
            case 15:System.out.println("\f");
                     cr="Wired Earphones";
                     WiredEarphones();
                    break;
                    
            case 16:System.out.println("\f");
                     cr="Handsfree";
                     Handsfree();
                    break;
                    
            case 17:System.out.println("\f");
                     cr="Smart Watch";
                     SmartWatch();
                    break;
                    
            case 18:System.out.println("\f");
                     cr="Smart Watch Accessories";
                     SmartWatchAccessories();
                    break;
                    
            case 19:System.out.println("\f");
                     cr="Daily Essentials";
                     DailyEssentials();
                    break;
                    
            case 20:System.out.println("\f");
                     cr="Storage Devices";
                     StorageDevices();
                    break;
                    
            default:System.out.println();
                     System.out.println("Invalid Entry... Please Try Again");
                     Invalid();
                    break;
        }
    }
    
    public void Mobiles()// #1
    {
        String c[]={"Apple","Vivo","Oppo","OnePlus","Xiaomi Mi & RedMi","Samsung"};
        int x, y;
        int ch, ch1;
        String ch2;
        System.out.println("Brands:-");
        for(x=0;x<6;x++)
        {
            System.out.println((x+1)+". "+c[x]);
        }
        System.out.println();
        System.out.println("Select Brand (enter only serial no.)");
        ch=sc.nextInt();
        System.out.println();
        
        if(ch==1)// APPLE
        {
            String v[]={"iPhone 7 Plus","iPhone 8","iPhone 8 Plus","iPhone X","iPhone XS","iPhone XS Max","iPhone XR"};
            int p[]={55000,60000,70000,90000,95000,134000,90000};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<7;y++)
            {
                System.out.println((y+1)+". "+v[y]+"   "+p[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch1=sc.nextInt();
            System.out.println();
            
            if(ch1==1)
            {
                pr=c[0]+"   "+v[0];
                System.out.println(v[0]+"   "+p[0]);
                price=p[0];
            }
            else if(ch1==2)
            {
                pr=c[0]+"   "+v[1];
                System.out.println(v[1]+"   "+p[1]);
                price=p[1];
            }
            else if(ch1==3)
            {
                pr=c[0]+"   "+v[2];
                System.out.println(v[2]+"   "+p[2]);
                price=p[2];
            }
            else if(ch1==4)
            {
                pr=c[0]+"   "+v[3];
                System.out.println(v[3]+"   "+p[3]);
                price=p[3];
            }
            else if(ch1==5)
            {
                pr=c[0]+"   "+v[4];
                System.out.println(v[4]+"   "+p[4]);
                price=p[4];
            }
            else if(ch1==6)
            {
                pr=c[0]+"   "+v[5];
                System.out.println(v[5]+"   "+p[5]);
                price=p[5];
            }
            else if(ch1==7)
            {
                pr=c[0]+"   "+v[6];
                System.out.println(v[6]+"   "+p[6]);
                price=p[6];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else if(ch==2)// VIVO
        {
            String v1[]={"V7","V7 Plus","V9","V9 Pro","V11","V11 Pro"};
            int p1[]={13000,15000,18000,19999,23999,25999};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<6;y++)
            {
                System.out.println((y+1)+". "+v1[y]+"   "+p1[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch1=sc.nextInt();
            System.out.println();
            
            if(ch1==1)
            {
                pr=c[1]+"   "+v1[0];
                System.out.println(v1[0]+"   "+p1[0]);
                price=p1[0];
            }
            else if(ch1==2)
            {
                pr=c[1]+"   "+v1[1];
                System.out.println(v1[1]+"   "+p1[1]);
                price=p1[1];
            }
            else if(ch1==3)
            {
                pr=c[1]+"   "+v1[2];
                System.out.println(v1[2]+"   "+p1[2]);
                price=p1[2];
            }
            else if(ch1==4)
            {
                pr=c[1]+"   "+v1[3];
                System.out.println(v1[3]+"   "+p1[3]);
                price=p1[3];
            }
            else if(ch1==5)
            {
                pr=c[1]+"   "+v1[4];
                System.out.println(v1[4]+"   "+p1[4]);
                price=p1[4];
            }
            else if(ch1==6)
            {
                pr=c[1]+"   "+v1[5];
                System.out.println(v1[5]+"   "+p1[5]);
                price=p1[5];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else if(ch==3)// OPPO
        {
            String v2[]={"F7","F7 Plus","F9","F9 Pro","RealMe 2 Pro"};
            int p2[]={13999,14999,18999,21999,20000};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<7;y++)
            {
                System.out.println((y+1)+". "+v2[y]+"   "+p2[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch1=sc.nextInt();
            System.out.println();
            
            if(ch1==1)
            {
                pr=c[2]+"   "+v2[0];
                System.out.println(v2[0]+"   "+p2[0]);
                price=p2[0];
            }
            else if(ch1==2)
            {
                pr=c[2]+"   "+v2[1];
                System.out.println(v2[1]+"   "+p2[1]);
                price=p2[1];
            }
            else if(ch1==3)
            {
                pr=c[2]+"   "+v2[2];
                System.out.println(v2[2]+"   "+p2[2]);
                price=p2[2];
            }
            else if(ch1==4)
            {
                pr=c[2]+"   "+v2[3];
                System.out.println(v2[3]+"   "+p2[3]);
                price=p2[3];
            }
            else if(ch1==5)
            {
                pr=c[2]+"   "+v2[4];
                System.out.println(v2[4]+"   "+p2[4]);
                price=p2[4];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else if(ch==4)// OnePlus
        {
            String v3[]={"3","3T","5","5T","6","6T"};
            int p3[]={20000,23000,29999,31999,35999,39999};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<6;y++)
            {
                System.out.println((y+1)+". "+v3[y]+"   "+p3[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch1=sc.nextInt();
            System.out.println();
            
            if(ch1==1)
            {
                pr=c[3]+"   "+v3[0];
                System.out.println(v3[0]+"   "+p3[0]);
                price=p3[0];
            }
            else if(ch1==2)
            {
                pr=c[3]+"   "+v3[1];
                System.out.println(v3[1]+"   "+p3[1]);
                price=p3[1];
            }
            else if(ch1==3)
            {
                pr=c[3]+"   "+v3[2];
                System.out.println(v3[2]+"   "+p3[2]);
                price=p3[2];
            }
            else if(ch1==4)
            {
                pr=c[3]+"   "+v3[3];
                System.out.println(v3[3]+"   "+p3[3]);
                price=p3[3];
            }
            else if(ch1==5)
            {
                pr=c[3]+"   "+v3[4];
                System.out.println(v3[4]+"   "+p3[4]);
                price=p3[4];
            }
            else if(ch1==6)
            {
                pr=c[3]+"   "+v3[5];
                System.out.println(v3[5]+"   "+p3[5]);
                price=p3[5];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else if(ch==5)// Xiaomi Mi & RedMi
        {
            String v4[]={"5","6","6 Pro","Poco F1","Mix 3","Note 5 Pro"};
            int p4[]={12999,15999,16999,20999,40999,17999};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<6;y++)
            {
                System.out.println((y+1)+". "+v4[y]+"   "+p4[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch1=sc.nextInt();
            System.out.println();
            
            if(ch1==1)
            {
                pr=c[4]+"   "+v4[0];
                System.out.println(v4[0]+"   "+p4[0]);
                price=p4[0];
            }
            else if(ch1==2)
            {
                pr=c[4]+"   "+v4[1];
                System.out.println(v4[1]+"   "+p4[1]);
                price=p4[1];
            }
            else if(ch1==3)
            {
                pr=c[4]+"   "+v4[2];
                System.out.println(v4[2]+"   "+p4[2]);
                price=p4[2];
            }
            else if(ch1==4)
            {
                pr=c[4]+"   "+v4[3];
                System.out.println(v4[3]+"   "+p4[3]);
                price=p4[3];
            }
            else if(ch1==5)
            {
                pr=c[4]+"   "+v4[4];
                System.out.println(v4[4]+"   "+p4[4]);
                price=p4[4];
            }
            else if(ch1==6)
            {
                pr=c[4]+"   "+v4[5];
                System.out.println(v4[5]+"   "+p4[5]);
                price=p4[5];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else if(ch==6)// SAMSUNG
        {
            String v5[]={"S8","S8+","S9","S9+","A7 (2018)","Note 8","Note 9"};
            int p5[]={55000,64000,70000,74999,55000,69000,80000};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<7;y++)
            {
                System.out.println((y+1)+". "+v5[y]+"   "+p5[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch1=sc.nextInt();
            System.out.println();
            
            if(ch1==1)
            {
                pr=c[5]+"   "+v5[0];
                System.out.println(v5[0]+"   "+p5[0]);
                price=p5[0];
            }
            else if(ch1==2)
            {
                pr=c[5]+"   "+v5[1];
                System.out.println(v5[1]+"   "+p5[1]);
                price=p5[1];
            }
            else if(ch1==3)
            {
                pr=c[5]+"   "+v5[2];
                System.out.println(v5[2]+"   "+p5[2]);
                price=p5[2];
            }
            else if(ch1==4)
            {
                pr=c[5]+"   "+v5[3];
                System.out.println(v5[3]+"   "+p5[3]);
                price=p5[3];
            }
            else if(ch1==5)
            {
                pr=c[5]+"   "+v5[4];
                System.out.println(v5[4]+"   "+p5[4]);
                price=p5[4];
            }
            else if(ch1==6)
            {
                pr=c[5]+"   "+v5[5];
                System.out.println(v5[5]+"   "+p5[5]);
                price=p5[5];
            }
            else if(ch1==7)
            {
                pr=c[5]+"   "+v5[6];
                System.out.println(v5[6]+"   "+p5[6]);
                price=p5[6];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
                        
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your First Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch2=sc.next();
        
        if(ch2.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
            System.out.println("Thank You");
        }
    }
    
    public void MobileAccessories()// #2
    {
        String v[]={"Screen Gaurd","Flip Cover","Back Cover","Charger","Wireless Charger"};
        int p[]={100,200,150,400,2399};
        int x, ch;
        String ch1;
        System.out.println("\f");
        System.out.println("Accessories:-");
        for(x=0;x<5;x++)
        {
            System.out.println((x+1)+". "+v[x]+"   "+p[x]);
        }
        System.out.println();
        System.out.println("Select Accessory (enter only serial no.)");
        ch=sc.nextInt();
        System.out.println();
        
        if(ch==1)
        {
            pr=v[0];
            System.out.println(v[0]+"   "+p[0]);
            price=p[0];
        }
        else if(ch==2)
        {
            pr=v[1];
            System.out.println(v[1]+"   "+p[1]);
            price=p[1];
        }
        else if(ch==3)
        {
            pr=v[2];
            System.out.println(v[2]+"   "+p[2]);
            price=p[2];
        }
        else if(ch==4)
        {
            pr=v[3];
            System.out.println(v[3]+"   "+p[3]);
            price=p[3];
        }
        else if(ch==5)
        {
            pr=v[4];
            System.out.println(v[4]+"   "+p[4]);
            price=p[4];
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your First Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch1=sc.next();
        
        if(ch1.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
        }
    }
    
    public void TVs()// #3
    {
        String c[]={"Sony","Samsung","Xiaomi Mi","LG"};
        int x, y;
        int ch, ch1;
        String ch2;
        System.out.println("Brands:-");
        for(x=0;x<4;x++)
        {
            System.out.println((x+1)+". "+c[x]);
        }
        System.out.println();
        System.out.println("Selct Brand (enter only serial no.)");
        ch=sc.nextInt();
        System.out.println();
        
        if(ch==1)// SONY
        {
            String v[]={"Bravia QLED","UHD TV","4K UDH TV","UHD+"};
            int s[]={43,55,65,55};
            int p[]={45000,70000,150000,100000};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<4;y++)
            {
                System.out.println((y+1)+". "+v[y]+"   "+s[y]+" inch   "+p[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch1=sc.nextInt();
            System.out.println();
            
            if(ch1==1)
            {
                pr=c[0]+"   "+s[0]+"   "+v[0];
                System.out.println(v[0]+"   "+s[0]+" inch   "+p[0]);
                price=p[0];
            }
            else if(ch1==2)
            {
                pr=c[0]+"   "+s[1]+"   "+v[1];
                System.out.println(v[1]+"   "+s[1]+" inch   "+p[1]);
                price=p[1];
            }
            else if(ch1==3)
            {
                pr=c[0]+"   "+s[2]+"   "+v[2];
                System.out.println(v[2]+"   "+s[2]+" inch   "+p[2]);
                price=p[2];
            }
            else if(ch1==4)
            {
                pr=c[0]+"   "+s[3]+"   "+v[3];
                System.out.println(v[3]+"   "+s[3]+" inch   "+p[3]);
                price=p[3];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else if(ch==2)// SAMSUNG
        {
            String v1[]={"Curved TV","UHD TV","4K UDH Curved TV","UHD+"};
            int s1[]={73,55,73,65};
            int p1[]={550000,85000,400000,325000};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<4;y++)
            {
                System.out.println((y+1)+". "+v1[y]+"   "+s1[y]+"inch   "+p1[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch1=sc.nextInt();
            System.out.println();
            
            if(ch1==1)
            {
                pr=c[1]+"   "+s1[0]+"   "+v1[0];
                System.out.println(v1[0]+"   "+s1[0]+" inch   "+p1[0]);
                price=p1[0];
            }
            else if(ch1==2)
            {
                pr=c[1]+"   "+s1[1]+"   "+v1[1];
                System.out.println(v1[1]+"   "+s1[1]+" inch   "+p1[1]);
                price=p1[1];
            }
            else if(ch1==3)
            {
                pr=c[1]+"   "+s1[2]+"   "+v1[2];
                System.out.println(v1[2]+"   "+s1[2]+" inch   "+p1[2]);
                price=p1[2];
            }
            else if(ch1==4)
            {
                pr=c[1]+"   "+s1[3]+"   "+v1[3];
                System.out.println(v1[3]+"   "+s1[3]+" inch   "+p1[3]);
                price=p1[3];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else if(ch==3)// Xiaomi Mi
        {
            String v2[]={"1","2","3","4"};
            int s2[]={32,32,43,55};
            int p2[]={14999,15999,28999,44999};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<4;y++)
            {
                System.out.println((y+1)+". "+v2[y]+"   "+s2[y]+" inch   "+p2[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch1=sc.nextInt();
            System.out.println();
            
            if(ch1==1)
            {
                pr=c[2]+"   "+s2[0]+"   "+v2[0];
                System.out.println(v2[0]+"   "+s2[0]+" inch   "+p2[0]);
                price=p2[0];
            }
            else if(ch1==2)
            {
                pr=c[2]+"   "+s2[1]+"   "+v2[1];
                System.out.println(v2[1]+"   "+s2[1]+" inch   "+p2[1]);
                price=p2[1];
            }
            else if(ch1==3)
            {
                pr=c[2]+"   "+s2[2]+"   "+v2[2];
                System.out.println(v2[2]+"   "+s2[2]+" inch   "+p2[2]);
                price=p2[2];
            }
            else if(ch1==4)
            {
                pr=c[2]+"   "+s2[3]+"   "+v2[3];
                System.out.println(v2[3]+"   "+s2[3]+" inch   "+p2[3]);
                price=p2[3];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else if(ch==4)// LG
        {
            String v3[]={"IPS","IPS+","4K TV","UHD TV"};
            int s3[]={32,43,55,43};
            int p3[]={24000,35000,55000,45000};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<4;y++)
            {
                System.out.println((y+1)+". "+v3[y]+"   "+s3[y]+" inch   "+p3[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch1=sc.nextInt();
            System.out.println();
            
            if(ch1==1)
            {
                pr=c[3]+"   "+s3[0]+"   "+v3[0];
                System.out.println(v3[0]+"   "+s3[0]+" inch   "+p3[0]);
                price=p3[0];
            }
            else if(ch1==2)
            {
                pr=c[3]+"   "+s3[1]+"   "+v3[1];
                System.out.println(v3[1]+"   "+s3[1]+" inch   "+p3[1]);
                price=p3[1];
            }
            else if(ch1==3)
            {
                pr=c[3]+"   "+s3[2]+"   "+v3[2];
                System.out.println(v3[2]+"   "+s3[2]+" inch   "+p3[2]);
                price=p3[2];
            }
            else if(ch1==4)
            {
                pr=c[3]+"   "+s3[3]+"   "+v3[3];
                System.out.println(v3[3]+"   "+s3[3]+" inch   "+p3[3]);
                price=p3[3];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your First Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch2=sc.next();
        
        if(ch2.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
            System.out.println("Thank You");
        }
    }
    
    public void TVAccessories()// #4
    {
        String v[]={"Wall Mount Stand","Floor Stand","Remotes","Covers"};
        int p[]={4000,3200,300,800};
        int x, ch;
        String ch1;
        System.out.println("\f");
        System.out.println("Accessories:-");
        for(x=0;x<4;x++)
        {
            System.out.println((x+1)+". "+v[x]+"   "+p[x]);
        }
        System.out.println();
        System.out.println("Select Accessory (enter only serial no.)");
        ch=sc.nextInt();
        System.out.println();
        
        if(ch==1)
        {
            pr=v[0];
            System.out.println(v[0]+"   "+p[0]);
            price=p[0];
        }
        else if(ch==2)
        {
            pr=v[1];
            System.out.println(v[1]+"   "+p[1]);
            price=p[1];
        }
        else if(ch==3)
        {
            pr=v[2];
            System.out.println(v[2]+"   "+p[2]);
            price=p[2];
        }
        else if(ch==4)
        {
            pr=v[3];
            System.out.println(v[3]+"   "+p[3]);
            price=p[3];
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your First Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch1=sc.next();
        
        if(ch1.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
            System.out.println("Thank You");
        }
    }
    
    public void Tablets()// #5
    {
        String c[]={"Apple","Lenovo","Samsung"};
        String v[]={"Mac","Yoga","Tab 4"};
        int p[]={80000,15000,10000};
        int x, ch;
        String ch1;
        System.out.println("\f");
        System.out.println("Tablets:-");
        for(x=0;x<3;x++)
        {
            System.out.println((x+1)+". "+c[x]+"   "+v[x]+"   "+p[x]);
        }
        System.out.println();
        System.out.println("Enter your choice (only serial no.)");
        ch=sc.nextInt();
        System.out.println();
        
        if(ch==1)
        {
            pr=c[0]+"   "+v[0];
            System.out.println(v[0]+"   "+p[0]);
            price=p[0];
        }
        else if(ch==2)
        {
            pr=c[1]+"   "+v[1];
            System.out.println(v[1]+"   "+p[1]);
            price=p[1];
        }
        else if(ch==3)
        {
            pr=c[2]+"   "+v[2];
            System.out.println(v[2]+"   "+p[2]);
            price=p[2];
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your First Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch1=sc.next();
        
        if(ch1.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
            System.out.println("Thank You");
        }
    }
    
    public void TabletAccessories()// #6
    {
        String v[]={"Flip Cover","Back Cover","Cover+Stand","Charger"};
        int p[]={500,400,700,900};
        int x, ch;
        String ch1;
        System.out.println("\f");
        System.out.println("Accessories:-");
        for(x=0;x<4;x++)
        {
            System.out.println((x+1)+". "+v[x]+"   "+p[x]);
        }
        System.out.println();
        System.out.println("Select Accessory (enter only serial no.)");
        ch=sc.nextInt();
        System.out.println();
        
        if(ch==1)
        {
            pr=v[0];
            System.out.println(v[0]+"   "+p[0]);
            price=p[0];
        }
        else if(ch==2)
        {
            pr=v[1];
            System.out.println(v[1]+"   "+p[1]);
            price=p[1];
        }
        else if(ch==3)
        {
            pr=v[2];
            System.out.println(v[2]+"   "+p[2]);
            price=p[2];
        }
        else if(ch==4)
        {
            pr=v[3];
            System.out.println(v[3]+"   "+p[3]);
            price=p[3];
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your First Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch1=sc.next();
        
        if(ch1.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
            System.out.println("Thank You");
        }
    }
    
    public void Laptops()// #7
    {
        String c[]={"Apple","HP","Lenovo","Dell"};
        int x, y;
        int ch, ch1, ch3;
        String ch2;
        System.out.println("Brands:-");
        for(x=0;x<4;x++)
        {
            System.out.println((x+1)+". "+c[x]);
        }
        System.out.println();
        System.out.println("Select Brand (enter only serial no.)");
        ch=sc.nextInt();
        System.out.println();
        
        if(ch==1)// APPLE
        {
            String v[]={"MacBook","MacBook Air","MacBook Pro","PC"};
            int p[]={95000,105000,150000,90000};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<4;y++)
            {
                System.out.println((y+1)+". "+v[y]+"   "+p[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch1=sc.nextInt();
            System.out.println();
            
            if(ch1==1)
            {
                pr=c[0]+"   "+v[0];
                System.out.println(v[0]+"   "+p[0]);
                price=p[0];
            }
            else if(ch1==2)
            {
                pr=c[0]+"   "+v[1];
                System.out.println(v[1]+"   "+p[1]);
                price=p[1];
            }
            else if(ch1==3)
            {
                pr=c[0]+"   "+v[2];
                System.out.println(v[2]+"   "+p[2]);
                price=p[2];
            }
            else if(ch1==4)
            {
                pr=c[0]+"   "+v[3];
                System.out.println(v[3]+"   "+p[3]);
                price=p[3];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            System.out.println();
            System.out.println("Enter Your First Name");
            nm=sc.next();
            System.out.println();
            System.out.println("Do you want to Confirm your Order?");
            System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
            ch2=sc.next();
        
            if(ch2.equals("y"))
            {
                System.out.println("\f");
                Bill();
            }
            else
            {
                System.out.println("\f");
                System.out.println("Your Order has not been Placed");
                System.out.println("Thank You");
            }
        }
        else if(ch==2)// HP
        {
            String v1[]={"Pavillion","Pavillion x360","Envy"};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<3;y++)
            {
                System.out.println((y+1)+". "+v1[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch1=sc.nextInt();
            System.out.println();
            
            if(ch1==1)
            {
                String w[]={"Windows 7","Windows 8","Windows 10","Windows 10 Pro"};
                int p[]={45000,55000,85000,105000};
                System.out.println("\f");
                System.out.println("Variants:-");
                for(y=0;y<4;y++)
                {
                    System.out.println((y+1)+". "+w[y]+"   "+p[y]);
                }
                System.out.println();
                System.out.println("Select Variant (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
                
                if(ch3==1)
                {
                    pr=c[1]+"   "+v1[0]+"   "+w[0];
                    System.out.println(w[0]+"   "+p[0]);
                    price=p[0];
                }
                else if(ch3==2)
                {
                    pr=c[1]+"   "+v1[0]+"   "+w[1];
                    System.out.println(w[1]+"   "+p[1]);
                    price=p[1];
                }
                else if(ch3==3)
                {
                    pr=c[1]+"   "+v1[0]+"   "+w[2];
                    System.out.println(w[2]+"   "+p[2]);
                    price=p[2];
                }
                else if(ch3==4)
                {
                    pr=c[1]+"   "+v1[0]+"   "+w[3];
                    System.out.println(w[3]+"   "+p[3]);
                    price=p[3];
                }
                else
                {
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                }
            }
            else if(ch1==2)
            {
                String w[]={"Windows 7","Windows 8","Windows 10","Windows 10 Pro"};
                int p[]={55000,45000,105000,135000};
                System.out.println("\f");
                System.out.println("Variants:-");
                for(y=0;y<4;y++)
                {
                    System.out.println((y+1)+". "+w[y]+"   "+p[y]);
                }
                System.out.println();
                System.out.println("Select Variant (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
                
                if(ch3==1)
                {
                    pr=c[1]+"   "+v1[1]+"   "+w[0];
                    System.out.println(w[0]+"   "+p[0]);
                    price=p[0];
                }
                else if(ch3==2)
                {
                    pr=c[1]+"   "+v1[1]+"   "+w[1];
                    System.out.println(w[1]+"   "+p[1]);
                    price=p[1];
                }
                else if(ch3==3)
                {
                    pr=c[1]+"   "+v1[1]+"   "+w[2];
                    System.out.println(w[2]+"   "+p[2]);
                    price=p[2];
                }
                else if(ch3==4)
                {
                    pr=c[1]+"   "+v1[1]+"   "+w[3];
                    System.out.println(w[3]+"   "+p[3]);
                    price=p[3];
                }
                else
                {
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                } 
            }
            else if(ch1==3)
            {
                String w[]={"Windows 7","Windows 8","Windows 10","Windows 10 Pro"};
                int p[]={45000,55000,70000,90000};
                System.out.println("\f");
                System.out.println("Variants:-");
                for(y=0;y<4;y++)
                {
                    System.out.println((y+1)+". "+w[y]+"   "+p[y]);
                }
                System.out.println();
                System.out.println("Select Variant (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
                
                if(ch3==1)
                {
                    pr=c[1]+"   "+v1[2]+"   "+w[0];
                    System.out.println(w[0]+"   "+p[0]);
                    price=p[0];
                }
                else if(ch3==2)
                {
                    pr=c[1]+"   "+v1[2]+"   "+w[1];
                    System.out.println(w[1]+"   "+p[1]);
                    price=p[1];
                }
                else if(ch3==3)
                {
                    pr=c[1]+"   "+v1[2]+"   "+w[2];
                    System.out.println(w[2]+"   "+p[2]);
                    price=p[2];
                }
                else if(ch3==4)
                {
                    pr=c[1]+"   "+v1[2]+"   "+w[3];
                    System.out.println(w[3]+"   "+p[3]);
                    price=p[3];
                }
                else
                {
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                }
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            System.out.println();
            System.out.println("Enter Your First Name");
            nm=sc.next();
            System.out.println("Enter Your Last Name");
            nm1=sc.next();
            System.out.println();
            System.out.println("Do you want to Confirm your Order?");
            System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
            ch2=sc.next();
        
            if(ch2.equals("y"))
            {
                System.out.println("\f");
                Bill();
            }
            else
            {
                System.out.println("\f");
                System.out.println("Your Order has not been Placed");
                System.out.println("Thank You");
            }
        
        }
        else if(ch==3)// LENOVO
        {
            String v2[]={"IdeaPad","ThinkPad","Yoga","Yoga UltraSlim"};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<4;y++)
            {
                System.out.println((y+1)+". "+v2[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch1=sc.nextInt();
            System.out.println();
            
            if(ch1==1)
            {
                String w[]={"Windows 7","Windows 8","Windows 10","Windows 10 Pro"};
                int p[]={19000,21000,24999,30000};
                System.out.println("\f");
                System.out.println("Variants:-");
                for(y=0;y<4;y++)
                {
                    System.out.println((y+1)+". "+w[y]+"   "+p[y]);
                }
                System.out.println();
                System.out.println("Select Variant (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
                
                if(ch3==1)
                {
                    pr=c[2]+"   "+v2[0]+"   "+w[0];
                    System.out.println(w[0]+"   "+p[0]);
                    price=p[0];
                }
                else if(ch3==2)
                {
                    pr=c[2]+"   "+v2[0]+"   "+w[1];
                    System.out.println(w[1]+"   "+p[1]);
                    price=p[1];
                }
                else if(ch3==3)
                {
                    pr=c[2]+"   "+v2[0]+"   "+w[2];
                    System.out.println(w[2]+"   "+p[2]);
                    price=p[2];
                }
                else if(ch3==4)
                {
                    pr=c[2]+"   "+v2[0]+"   "+w[3];
                    System.out.println(w[3]+"   "+p[3]);
                    price=p[3];
                }
                else
                {
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                }
            }
            else if(ch1==2)
            {
                String w[]={"Windows 7","Windows 8","Windows 10","Windows 10 Pro"};
                int p[]={20000,21999,25000,31000};
                System.out.println("\f");
                System.out.println("Variants:-");
                for(y=0;y<4;y++)
                {
                    System.out.println((y+1)+". "+w[y]+"   "+p[y]);
                }
                System.out.println();
                System.out.println("Select Variant (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
                
                if(ch3==1)
                {
                    pr=c[2]+"   "+v2[1]+"   "+w[0];
                    System.out.println(w[0]+"   "+p[0]);
                    price=p[0];
                }
                else if(ch3==2)
                {
                    pr=c[2]+"   "+v2[1]+"   "+w[1];
                    System.out.println(w[1]+"   "+p[1]);
                    price=p[1];
                }
                else if(ch3==3)
                {
                    pr=c[2]+"   "+v2[1]+"   "+w[2];
                    System.out.println(w[2]+"   "+p[2]);
                    price=p[2];
                }
                else if(ch3==4)
                {
                    pr=c[2]+"   "+v2[1]+"   "+w[3];
                    System.out.println(w[3]+"   "+p[3]);
                    price=p[3];
                }
                else
                {
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                } 
                
            }
            else if(ch1==3)
            {
                String w[]={"Windows 7","Windows 8","Windows 10","Windows 10 Pro"};
                int p[]={23000,25999,30000,32999};
                System.out.println("\f");
                System.out.println("Variants:-");
                for(y=0;y<4;y++)
                {
                    System.out.println((y+1)+". "+w[y]+"   "+p[y]);
                }
                System.out.println();
                System.out.println("Select Variant (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
                
                if(ch3==1)
                {
                    pr=c[2]+"   "+v2[2]+"   "+w[0];
                    System.out.println(w[0]+"   "+p[0]);
                    price=p[0];
                }
                else if(ch3==2)
                {
                    pr=c[2]+"   "+v2[2]+"   "+w[1];
                    System.out.println(w[1]+"   "+p[1]);
                    price=p[1];
                }
                else if(ch3==3)
                {
                    pr=c[2]+"   "+v2[2]+"   "+w[2];
                    System.out.println(w[2]+"   "+p[2]);
                    price=p[2];
                }
                else if(ch3==4)
                {
                    pr=c[2]+"   "+v2[2]+"   "+w[3];
                    System.out.println(w[3]+"   "+p[3]);
                    price=p[3];
                }
                else
                {
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                }
            }
            else if(ch1==4)
            {
                String w[]={"Windows 7","Windows 8","Windows 10","Windows 10 Pro"};
                int p[]={30000,33000,42999,50000};
                System.out.println("\f");
                System.out.println("Variants:-");
                for(y=0;y<4;y++)
                {
                    System.out.println((y+1)+". "+w[y]+"   "+p[y]);
                }
                System.out.println();
                System.out.println("Select Variant (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
                
                if(ch3==1)
                {
                    pr=c[2]+"   "+v2[2]+"   "+w[0];
                    System.out.println(w[0]+"   "+p[0]);
                    price=p[0];
                }
                else if(ch3==2)
                {
                    pr=c[2]+"   "+v2[2]+"   "+w[1];
                    System.out.println(w[1]+"   "+p[1]);
                    price=p[1];
                }
                else if(ch3==3)
                {
                    pr=c[2]+"   "+v2[2]+"   "+w[2];
                    System.out.println(w[2]+"   "+p[2]);
                    price=p[2];
                }
                else if(ch3==4)
                {
                    pr=c[2]+"   "+v2[2]+"   "+w[3];
                    System.out.println(w[3]+"   "+p[3]);
                    price=p[3];
                }
                else
                {
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                }
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            System.out.println();
            System.out.println("Enter Your First Name");
            nm=sc.next();
            System.out.println();
            System.out.println("Do you want to Confirm your Order?");
            System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
            ch2=sc.next();
        
            if(ch2.equals("y"))
            {
                System.out.println("\f");
                Bill();
            }
            else
            {
                System.out.println("\f");
                System.out.println("Your Order has not been Placed");
                System.out.println("Thank You");
            }
        }
        else if(ch==4)// DELL
        {
            String v3[]={"Inspiron Core","Inspiron 7000 Infinity","Intel Pentium"};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<3;y++)
            {
                System.out.println((y+1)+". "+v3[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch1=sc.nextInt();
            System.out.println();
            
            if(ch1==1)
            {
                String w[]={"Windows 7","Windows 8","Windows 10","Windows 10 Pro"};
                int p[]={19000,23999,25999,27999};
                System.out.println("\f");
                System.out.println("Variants:-");
                for(y=0;y<4;y++)
                {
                    System.out.println((y+1)+". "+w[y]+"   "+p[y]);
                }
                System.out.println();
                System.out.println("Select Variant (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
                
                if(ch3==1)
                {
                    pr=c[3]+"   "+v3[0]+"   "+w[0];
                    System.out.println(w[0]+"   "+p[0]);
                    price=p[0];
                }
                else if(ch3==2)
                {
                    pr=c[3]+"   "+v3[0]+"   "+w[1];
                    System.out.println(w[1]+"   "+p[1]);
                    price=p[1];
                }
                else if(ch3==3)
                {
                    pr=c[3]+"   "+v3[0]+"   "+w[2];
                    System.out.println(w[2]+"   "+p[2]);
                    price=p[2];
                }
                else if(ch3==4)
                {
                    pr=c[3]+"   "+v3[0]+"   "+w[3];
                    System.out.println(w[3]+"   "+p[3]);
                    price=p[3];
                }
                else
                {
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                }
            }
            else if(ch1==2)
            {
                String w[]={"Windows 7","Windows 8","Windows 10","Windows 10 Pro"};
                int p[]={80000,95000,10500,134999};
                System.out.println("\f");
                System.out.println("Variants:-");
                for(y=0;y<4;y++)
                {
                    System.out.println((y+1)+". "+w[y]+"   "+p[y]);
                }
                System.out.println();
                System.out.println("Select Variant (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
                
                if(ch3==1)
                {
                    pr=c[3]+"   "+v3[1]+"   "+w[0];
                    System.out.println(w[0]+"   "+p[0]);
                    price=p[0];
                }
                else if(ch3==2)
                {
                    pr=c[3]+"   "+v3[1]+"   "+w[1];
                    System.out.println(w[1]+"   "+p[1]);
                    price=p[1];
                }
                else if(ch3==3)
                {
                    pr=c[3]+"   "+v3[1]+"   "+w[2];
                    System.out.println(w[2]+"   "+p[2]);
                    price=p[2];
                }
                else if(ch3==4)
                {
                    pr=c[3]+"   "+v3[1]+"   "+w[3];
                    System.out.println(w[3]+"   "+p[3]);
                    price=p[3];
                }
                else
                {
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                } 
            }
            else if(ch1==3)
            {
                String w[]={"Windows 7","Windows 8","Windows 10","Windows 10 Pro"};
                int p[]={18999,20000,24999,26999};
                System.out.println("\f");
                System.out.println("Variants:-");
                for(y=0;y<4;y++)
                {
                    System.out.println((y+1)+". "+w[y]+"   "+p[y]);
                }
                System.out.println();
                System.out.println("Select Variant (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
                
                if(ch3==1)
                {
                    pr=c[3]+"   "+v3[2]+"   "+w[0];
                    System.out.println(w[0]+"   "+p[0]);
                    price=p[0];
                }
                else if(ch3==2)
                {
                    pr=c[3]+"   "+v3[2]+"   "+w[1];
                    System.out.println(w[1]+"   "+p[1]);
                    price=p[1];
                }
                else if(ch3==3)
                {
                    pr=c[3]+"   "+v3[2]+"   "+w[2];
                    System.out.println(w[2]+"   "+p[2]);
                    price=p[2];
                }
                else if(ch3==4)
                {
                    pr=c[3]+"   "+v3[2]+"   "+w[3];
                    System.out.println(w[3]+"   "+p[3]);
                    price=p[3];
                }
                else
                {
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                }
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            System.out.println();
            System.out.println("Enter Your First Name");
            nm=sc.next();
            System.out.println("Enter Your Last Name");
            nm1=sc.next();
            System.out.println();
            System.out.println("Do you want to Confirm your Order?");
            System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
            ch2=sc.next();
        
            if(ch2.equals("y"))
            {
                System.out.println("\f");
                Bill();
            }
            else
            {
                System.out.println("\f");
                System.out.println("Your Order has not been Placed");
                System.out.println("Thank You");
            }
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
    }
    
    public void LaptopAccessories()// #8
    {
        String v[]={"Charger","Bagpack","Wired Mouse","Wired Keyboard","Wireless Mouse","Wireless Keyboard"};
        int p[]={3500,900,250,250,400,400};
        int x, ch;
        String ch1;
        System.out.println("\f");
        System.out.println("Accessories:-");
        for(x=0;x<6;x++)
        {
            System.out.println((x+1)+". "+v[x]+"   "+p[x]);
        }
        System.out.println();
        System.out.println("Select Accessory (enter only serial no.)");
        ch=sc.nextInt();
        System.out.println();
        
        if(ch==1)
        {
            pr=v[0];
            System.out.println(v[0]+"   "+p[0]);
            price=p[0];
        }
        else if(ch==2)
        {
            pr=v[1];
            System.out.println(v[1]+"   "+p[1]);
            price=p[1];
        }
        else if(ch==3)
        {
            pr=v[2];
            System.out.println(v[2]+"   "+p[2]);
            price=p[2];
        }
        else if(ch==4)
        {
            pr=v[3];
            System.out.println(v[3]+"   "+p[3]);
            price=p[3];
        }
        else if(ch==5)
        {
            pr=v[4];
            System.out.println(v[4]+"   "+p[4]);
            price=p[4];
        }
        else if(ch==6)
        {
            pr=v[5];
            System.out.println(v[5]+"   "+p[5]);
            price=p[5];
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch1=sc.next();
        
        if(ch1.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
        }
    }
    
    public void BluetoothSpeakers()// #9
    {
        String c[]={"JBL","Boat","Philips","Bose"};
        int x, y;
        int ch, ch2;
        String ch1;
        System.out.println("\f");
        System.out.println("Brands:-");
        for(x=0;x<4;x++)
        {
            System.out.println((x+1)+". "+c[x]);
        }
        System.out.println();
        System.out.println("Select Brand (enter only serial no.)");
        ch=sc.nextInt();
        System.out.println();
        
        if(ch==1)// JBL
        {
            String v[]={"Go","Clip 3","Flip 4","Pulse 3","Charge 3","BoomBox"};
            int p[]={1799,3999,7950,14340,11290,26999};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<6;y++)
            {
                System.out.println((y+1)+". "+v[y]+"   "+p[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch2=sc.nextInt();
            System.out.println();
            
            if(ch2==1)
            {
                pr=c[0]+"   "+v[0];
                System.out.println(v[0]+"   "+p[0]);
                price=p[0];
            }
            else if(ch2==2)
            {
                pr=c[0]+"   "+v[1];
                System.out.println(v[1]+"   "+p[1]);
                price=p[1];
            }
            else if(ch2==3)
            {
                pr=c[0]+"   "+v[2];
                System.out.println(v[2]+"   "+p[2]);
                price=p[2];
            }
            else if(ch2==4)
            {
                pr=c[0]+"   "+v[3];
                System.out.println(v[3]+"   "+p[3]);
                price=p[3];
            }
            else if(ch2==5)
            {
                pr=c[0]+"   "+v[4];
                System.out.println(v[4]+"   "+p[4]);
                price=p[4];
            }
            else if(ch2==6)
            {
                pr=c[0]+"   "+v[5];
                System.out.println(v[5]+"   "+p[5]);
                price=p[5];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else if(ch==2)// BOAT
        { 
            String v1[]={"Stone 200","Stone 1000","Stone 260","Stone 700","Rugby"};
            int p1[]={1099,2249,1449,1500,1649};
            System.out.println("\f");
            System.out.println("Models:-");
             for(y=0;y<5;y++)
            {
                System.out.println((y+1)+". "+v1[y]+"   "+p1[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch2=sc.nextInt();
            System.out.println();
            
            if(ch2==1)
            {
                pr=c[1]+"   "+v1[0];
                System.out.println(v1[0]+"   "+p1[0]);
                price=p1[0];
            }
            else if(ch2==2)
            {
                pr=c[1]+"   "+v1[1];
                System.out.println(v1[1]+"   "+p1[1]);
                price=p1[1];
            }
            else if(ch2==3)
            {
                pr=c[1]+"   "+v1[2];
                System.out.println(v1[2]+"   "+p1[2]);
                price=p1[2];
            }
            else if(ch2==4)
            {
                pr=c[1]+"   "+v1[3];
                System.out.println(v1[3]+"   "+p1[3]);
                price=p1[3];
            }
            else if(ch2==5)
            {
                pr=c[1]+"   "+v1[4];
                System.out.println(v1[4]+"   "+p1[4]);
                price=p1[4];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else if(ch==3)// PHILLIPS
        {
            String v2[]={"BT64B","BT50B","BT64A"};
            int p2[]={1299,1499,2200};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<3;y++)
            {
                System.out.println((y+1)+". "+v2[y]+"   "+p2[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch2=sc.nextInt();
            System.out.println();
            
            if(ch2==1)
            {
                pr=c[2]+"   "+v2[0];
                System.out.println(v2[0]+"   "+p2[0]);
                price=p2[0];
            }
            else if(ch2==2)
            {
                pr=c[2]+"   "+v2[1];
                System.out.println(v2[1]+"   "+p2[1]);
                price=p2[1];
            }
            else if(ch2==3)
            {
                pr=c[2]+"   "+v2[2];
                System.out.println(v2[2]+"   "+p2[2]);
                price=p2[2];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else if(ch==4)// BOSE
        {
            String v3[]={"SoundLink Mini","SoundLink Revolve+","SoundLink Color II","SoundLink Micro"};
            int p3[]={16200,22050,11500,8090};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<4;y++)
            {
                System.out.println((y+1)+". "+v3[y]+"   "+p3[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch2=sc.nextInt();
            System.out.println();
            
            if(ch2==1)
            {
                pr=c[3]+"   "+v3[0];
                System.out.println(v3[0]+"   "+p3[0]);
                price=p3[0];
            }
            else if(ch2==2)
            {
                pr=c[3]+"   "+v3[1];
                System.out.println(v3[1]+"   "+p3[1]);
                price=p3[1];
            }
            else if(ch2==3)
            {
                pr=c[3]+"   "+v3[2];
                System.out.println(v3[2]+"   "+p3[2]);
                price=p3[2];
            }
            else if(ch2==4)
            {
                pr=c[3]+"   "+v3[3];
                System.out.println(v3[3]+"   "+p3[3]);
                price=p3[3];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your First Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch1=sc.next();
        
        if(ch1.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
        }
    }
    
    public void ChannelSpeakers()// #10
    {
        String c[]={"JBL","Sony","Philips","Bose"};
        String v[]={"Bar 2.0","2.1 Channel","2.1 Channel","Woofer and Sound Bar"};
        int p[]={8999,5999,3699,35000};
        int x, ch;
        String ch1;
        System.out.println("\f");
        System.out.println("Brands & Models:-");
        for(x=0;x<4;x++)
        {
            System.out.println((x+1)+". "+c[x]+"   "+v[x]+"   "+p[x]);
        }
        System.out.println();
        System.out.println("Enter your Choice (only serial no.)");
        ch=sc.nextInt();
        System.out.println();
           
        if(ch==1)
        {
            pr=c[0]+"   "+v[0];
            System.out.println(v[0]+"   "+p[0]);
            price=p[0];
        }
        else if(ch==2)
        {
            pr=c[1]+"   "+v[1];
            System.out.println(v[1]+"   "+p[1]);
            price=p[1];
        }
        else if(ch==3)
        {
            pr=c[2]+"   "+v[2];
            System.out.println(v[2]+"   "+p[2]);
            price=p[2];
        }
        else if(ch==4)
        {
            pr=c[3]+"   "+v[3];
            System.out.println(v[3]+"   "+p[3]);
            price=p[3];
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your First Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch1=sc.next();
        
        if(ch1.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
        }
    }
    
    public void HomeTheatreSystem()// #11
    {
        String c[]={"JBL","Sony","Philips"};
        String v[]={"Bar 5.1","5.1 Channel","5.1 Channel"};
        int p[]={49999,15000,10000};
        int x, ch;
        String ch1;
        System.out.println("\f");
        System.out.println("Brands & Models:-");
        for(x=0;x<3;x++)
        {
            System.out.println((x+1)+". "+c[x]+"   "+v[x]+"   "+p[x]);
        }
        System.out.println();
        System.out.println("Enter your Choice (only serial no.)");
        ch=sc.nextInt();
        System.out.println();
           
        if(ch==1)
        {
            pr=c[0]+"   "+v[0];
            System.out.println(v[0]+"   "+p[0]);
            price=p[0];
        }
        else if(ch==2)
        {
            pr=c[1]+"   "+v[1];
            System.out.println(v[1]+"   "+p[1]);
            price=p[1];
        }
        else if(ch==3)
        {
            pr=c[2]+"   "+v[2];
            System.out.println(v[2]+"   "+p[2]);
            price=p[2];
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your First Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch1=sc.next();
        
        if(ch1.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
        }
    }
    
    public void BluetoothHeadphones()// #12
    {
        String c[]={"JBL","Boat","Sony","Bose"};
        String v[]={"Tune 600 BT","BassHeads 250 BT","500 BT","SoundBT"};
        int p[]={7599,1499,4599,29999};
        int x, ch;
        String ch1;
        System.out.println("\f");
        System.out.println("Brands & Models:-");
        for(x=0;x<4;x++)
        {
            System.out.println((x+1)+". "+c[x]+"   "+v[x]+"   "+p[x]);
        }
        System.out.println();
        System.out.println("Enter your Choice (only serial no.)");
        ch=sc.nextInt();
        System.out.println();
           
        if(ch==1)
        {
            pr=c[0]+"   "+v[0];
            System.out.println(v[0]+"   "+p[0]);
            price=p[0];
        }
        else if(ch==2)
        {
            pr=c[1]+"   "+v[1];
            System.out.println(v[1]+"   "+p[1]);
            price=p[1];
        }
        else if(ch==3)
        {
            pr=c[2]+"   "+v[2];
            System.out.println(v[2]+"   "+p[2]);
            price=p[2];
        }
        else if(ch==4)
        {
            pr=c[3]+"   "+v[3];
            System.out.println(v[3]+"   "+p[3]);
            price=p[3];
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your First Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch1=sc.next();
        
        if(ch1.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
        }
    }
    
    public void WiredHeadphones()// #13
    {
        String c[]={"JBL","Boat","Sony","Bose"};
        String v[]={"Pulse Headphones","BassHeads 200","ExtraaaBass","Sound500"};
        int p[]={1000,900,2500,10000};
        int x, ch;
        String ch1;
        System.out.println("\f");
        System.out.println("Brands & Models:-");
        for(x=0;x<4;x++)
        {
            System.out.println((x+1)+". "+c[x]+"   "+v[x]+"   "+p[x]);
        }
        System.out.println();
        System.out.println("Enter your Choice (only serial no.)");
        ch=sc.nextInt();
        System.out.println();
           
        if(ch==1)
        {
            pr=c[0]+"   "+v[0];
            System.out.println(v[0]+"   "+p[0]);
            price=p[0];
        }
        else if(ch==2)
        {
            pr=c[1]+"   "+v[1];
            System.out.println(v[1]+"   "+p[1]);
            price=p[1];
        }
        else if(ch==3)
        {
            pr=c[2]+"   "+v[2];
            System.out.println(v[2]+"   "+p[2]);
            price=p[2];
        }
        else if(ch==4)
        {
            pr=c[3]+"   "+v[3];
            System.out.println(v[3]+"   "+p[3]);
            price=p[3];
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your First Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch1=sc.next();
        
        if(ch1.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
        }
    }
    
    public void BluetoothEarphones()// #14
    {
        String c[]={"JBL","Boat","Sony","Bose"};
        String v[]={"600 BT","BassHeads BT","ExtraaaBass BT","SoundDot BT"};
        int p[]={4599,1499,3000,25000};
        int x, ch;
        String ch1;
        System.out.println("\f");
        System.out.println("Brands & Models:-");
        for(x=0;x<4;x++)
        {
            System.out.println((x+1)+". "+c[x]+"   "+v[x]+"   "+p[x]);
        }
        System.out.println();
        System.out.println("Enter your Choice (only serial no.)");
        ch=sc.nextInt();
        System.out.println();
           
        if(ch==1)
        {
            pr=c[0]+"   "+v[0];
            System.out.println(v[0]+"   "+p[0]);
            price=p[0];
        }
        else if(ch==2)
        {
            pr=c[1]+"   "+v[1];
            System.out.println(v[1]+"   "+p[1]);
            price=p[1];
        }
        else if(ch==3)
        {
            pr=c[2]+"   "+v[2];
            System.out.println(v[2]+"   "+p[2]);
            price=p[2];
        }
        else if(ch==4)
        {
            pr=c[3]+"   "+v[3];
            System.out.println(v[3]+"   "+p[3]);
            price=p[3];
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your First Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch1=sc.next();
        
        if(ch1.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
        }
    }
    
    public void WiredEarphones()// #15
    {
        String c[]={"JBL","Boat","Sony","Beats"};
        String v[]={"In-Ear","BassHeads 250 Wired","Wired In-Ear","In-Ear"};
        int p[]={800,600,450,5000};
        int x, ch;
        String ch1;
        System.out.println("\f");
        System.out.println("Brands & Models:-");
        for(x=0;x<4;x++)
        {
            System.out.println((x+1)+". "+c[x]+"   "+v[x]+"   "+p[x]);
        }
        System.out.println();
        System.out.println("Enter your Choice (only serial no.)");
        ch=sc.nextInt();
        System.out.println();
           
        if(ch==1)
        {
            pr=c[0]+"   "+v[0];
            System.out.println(v[0]+"   "+p[0]);
            price=p[0];
        }
        else if(ch==2)
        {
            pr=c[1]+"   "+v[1];
            System.out.println(v[1]+"   "+p[1]);
            price=p[1];
        }
        else if(ch==3)
        {
            pr=c[2]+"   "+v[2];
            System.out.println(v[2]+"   "+p[2]);
            price=p[2];
        }
        else if(ch==4)
        {
            pr=c[3]+"   "+v[3];
            System.out.println(v[3]+"   "+p[3]);
            price=p[3];
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your First Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch1=sc.next();
        
        if(ch1.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
        }
    }
    
    public void Handsfree()// #16
    {
        String c[]={"Xiaomi Mi","Nokia","Samsung"};
        String v[]={"BT Stick","BH-110","BT Handsfree"};
        int p[]={1000,500,800};
        int x, ch;
        String ch1;
        System.out.println("\f");
        System.out.println("Brands & Models:-");
        for(x=0;x<3;x++)
        {
            System.out.println((x+1)+". "+c[x]+"   "+v[x]+"   "+p[x]);
        }
        System.out.println();
        System.out.println("Enter your Choice (only serial no.)");
        ch=sc.nextInt();
        System.out.println();
           
        if(ch==1)
        {
            pr=c[0]+"   "+v[0];
            System.out.println(v[0]+"   "+p[0]);
            price=p[0];
        }
        else if(ch==2)
        {
            pr=c[1]+"   "+v[1];
            System.out.println(v[1]+"   "+p[1]);
            price=p[1];
        }
        else if(ch==3)
        {
            pr=c[2]+"   "+v[2];
            System.out.println(v[2]+"   "+p[2]);
            price=p[2];
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your First Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch1=sc.next();
        
        if(ch1.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
        }
    }
    
    public void SmartWatch()// #17
    {
        String c[]={"Apple","Xiaomi Mi","Samsung","FitBit"};
        int x, y;
        int ch, ch2;
        String ch1;
        System.out.println("\f");
        System.out.println("Brands:-");
        for(x=0;x<4;x++)
        {
            System.out.println((x+1)+". "+c[x]);
        }
        System.out.println();
        System.out.println("Select Brand (enter only serial no.)");
        ch=sc.nextInt();
        System.out.println();
        
        if(ch==1)// APPLE
        {
            String v[]={"Series 3","Series 4","Nike+"};
            int p[]={24999,35999,99500};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<3;y++)
            {
                System.out.println((y+1)+". "+v[y]+"   "+p[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch2=sc.nextInt();
            System.out.println();
            
            if(ch2==1)
            {
                pr=c[0]+"   "+v[0]+"   "+p[0];
                System.out.println(v[0]+"   "+p[0]);
                price=p[0];
            }
            else if(ch2==2)
            {
                pr=c[0]+"   "+v[1]+"   "+p[1];
                System.out.println(v[1]+"   "+p[1]);
                price=p[1];
            }
            else if(ch2==3)
            {
                pr=c[0]+"   "+v[2]+"   "+p[2];
                System.out.println(v[2]+"   "+p[2]);
                price=p[2];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else if(ch==2)// Xiaomi Mi
        {
            String v1[]={"Mi Band","Mi Band HRX Edition","Mi Band 2","Mi Band 3"};
            int p1[]={999,1299,1799,2100};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<4;y++)
            {
                System.out.println((y+1)+". "+v1[y]+"   "+p1[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch2=sc.nextInt();
            System.out.println();
            
            if(ch2==1)
            {
                pr=c[1]+"   "+v1[0]+"   "+p1[0];
                System.out.println(v1[0]+"   "+p1[0]);
                price=p1[0];
            }
            else if(ch2==2)
            {
                pr=c[1]+"   "+v1[1]+"   "+p1[1];
                System.out.println(v1[1]+"   "+p1[1]);
                price=p1[1];
            }
            else if(ch2==3)
            {
                pr=c[1]+"   "+v1[2]+"   "+p1[2];
                System.out.println(v1[2]+"   "+p1[2]);
                price=p1[2];
            }
            else if(ch2==4)
            {
                pr=c[1]+"   "+v1[3]+"   "+p1[3];
                System.out.println(v1[3]+"   "+p1[3]);
                price=p1[3];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else if(ch==3)// SAMSUNG
        {
            String v2[]={"Gear S2","Gear S3 Frontier","Gear Sport","Fit2 Pro"};
            int p2[]={23999,19990,20999,27999};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<4;y++)
            {
                System.out.println((y+1)+". "+v2[y]+"   "+p2[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch2=sc.nextInt();
            System.out.println();
            
            if(ch2==1)
            {
                pr=c[2]+"   "+v2[0]+"   "+p2[0];
                System.out.println(v2[0]+"   "+p2[0]);
                price=p2[0];
            }
            else if(ch2==2)
            {
                pr=c[2]+"   "+v2[1]+"   "+p2[1];
                System.out.println(v2[1]+"   "+p2[1]);
                price=p2[1];
            }
            else if(ch2==3)
            {
                pr=c[2]+"   "+v2[2]+"   "+p2[2];
                System.out.println(v2[2]+"   "+p2[2]);
                price=p2[2];
            }
            else if(ch2==4)
            {
                pr=c[2]+"   "+v2[3]+"   "+p2[3];
                System.out.println(v2[3]+"   "+p2[3]);
                price=p2[3];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else if(ch==4)// FitBit
        {
            String v3[]={"Charge 2","Flex 2","Versa","Ionic"};
            int p3[]={13000,3499,16999,21305};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<4;y++)
            {
                System.out.println((y+1)+". "+v3[y]+"   "+p3[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch2=sc.nextInt();
            System.out.println();
            
            if(ch2==1)
            {
                pr=c[3]+"   "+v3[0]+"   "+p3[0];
                System.out.println(v3[0]+"   "+p3[0]);
                price=p3[0];
            }
            else if(ch2==2)
            {
                pr=c[3]+"   "+v3[1]+"   "+p3[1];
                System.out.println(v3[1]+"   "+p3[1]);
                price=p3[1];
            }
            else if(ch2==3)
            {
                pr=c[3]+"   "+v3[2]+"   "+p3[2];
                System.out.println(v3[2]+"   "+p3[2]);
                price=p3[2];
            }
            else if(ch2==4)
            {
                pr=c[3]+"   "+v3[3]+"   "+p3[3];
                System.out.println(v3[3]+"   "+p3[3]);
                price=p3[3];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your First Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch1=sc.next();
        
        if(ch1.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
        }
    }
    
    public void SmartWatchAccessories()// #18
    {
        String v[]={"Screen Gaurd","AirCharge for Apple","Charger for Xiaomi Mi","Replacement Band for Apple","Replacement Band for Xiaomi Mi"}; 
        int p[]={249,4000,1000,3499,300};
        int x, ch;
        String ch1;
        System.out.println("\f");
        System.out.println("Accessories:-");
        for(x=0;x<5;x++)
        {
            System.out.println((x+1)+". "+v[x]+"   "+p[x]);
        }
        System.out.println();
        System.out.println("Select Accessory (enter only serial no.)");
        ch=sc.nextInt();
        System.out.println();
        
        if(ch==1)
        {
            pr=v[0];
            System.out.println(v[0]+"   "+p[0]);
            price=p[0];
        }
        else if(ch==2)
        {
            pr=v[1];
            System.out.println(v[1]+"   "+p[1]);
            price=p[1];
        }
        else if(ch==3)
        {
            pr=v[2];
            System.out.println(v[2]+"   "+p[2]);
            price=p[2];
        }
        else if(ch==4)
        {
            pr=v[3];
            System.out.println(v[3]+"   "+p[3]);
            price=p[3];
        }
        else if(ch==5)
        {
            pr=v[4];
            System.out.println(v[4]+"   "+p[4]);
            price=p[4];
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch1=sc.next();
        
        if(ch1.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
        }
    }
    
    public void DailyEssentials()// #19
    {
        String c[]={"Philips","Panasonic","Samsung","LG"};
        int x, y;
        int ch, ch2;
        String ch1;
        System.out.println("\f");
        System.out.println("Brands:-");
        for(x=0;x<4;x++)
        {
            System.out.println((x+1)+". "+c[x]);
        }
        System.out.println();
        System.out.println("Select Brand (enter only serial no.)");
        ch=sc.nextInt();
        System.out.println();
        
        if(ch==1)// Philips
        {
            String v[]={"Trimmers","Shavers","Irons"};
            int p[]={1349,1999,900};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<3;y++)
            {
                System.out.println((y+1)+". "+v[y]+"   "+p[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch2=sc.nextInt();
            System.out.println();
            
            if(ch2==1)
            {
                pr=c[0]+"   "+v[0]+"   "+p[0];
                System.out.println(v[0]+"   "+p[0]);
                price=p[0];
            }
            else if(ch2==2)
            {
                pr=c[0]+"   "+v[1]+"   "+p[1];
                System.out.println(v[1]+"   "+p[1]);
                price=p[1];
            }
            else if(ch2==3)
            {
                pr=c[0]+"   "+v[2]+"   "+p[2];
                System.out.println(v[2]+"   "+p[2]);
                price=p[2];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else if(ch==2)// Panasonic
        {
            String v1[]={"ACs","Trimmers","Irons"};
            int p1[]={24000,1999,900};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<3;y++)
            {
                System.out.println((y+1)+". "+v1[y]+"   "+p1[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch2=sc.nextInt();
            System.out.println();
            
            if(ch2==1)
            {
                pr=c[1]+"   "+v1[0]+"   "+p1[0];
                System.out.println(v1[0]+"   "+p1[0]);
                price=p1[0];
            }
            else if(ch2==2)
            {
                pr=c[1]+"   "+v1[1]+"   "+p1[1];
                System.out.println(v1[1]+"   "+p1[1]);
                price=p1[1];
            }
            else if(ch2==3)
            {
                pr=c[1]+"   "+v1[2]+"   "+p1[2];
                System.out.println(v1[2]+"   "+p1[2]);
                price=p1[2];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else if(ch==3)// Samsung
        {
            String v2[]={"ACs","Refridgerators","Washing Machine","Microvave Oven"};
            int p2[]={25000,35000,12000,16000};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<4;y++)
            {
                System.out.println((y+1)+". "+v2[y]+"   "+p2[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch2=sc.nextInt();
            System.out.println();
            
            if(ch2==1)
            {
                pr=c[2]+"   "+v2[0]+"   "+p2[0];
                System.out.println(v2[0]+"   "+p2[0]);
                price=p2[0];
            }
            else if(ch2==2)
            {
                pr=c[2]+"   "+v2[1]+"   "+p2[1];
                System.out.println(v2[1]+"   "+p2[1]);
                price=p2[1];
            }
            else if(ch2==3)
            {
                pr=c[2]+"   "+v2[2]+"   "+p2[2];
                System.out.println(v2[2]+"   "+p2[2]);
                price=p2[2];
            }
            else if(ch2==4)
            {
                pr=c[3]+"   "+v2[3]+"   "+p2[3];
                System.out.println(v2[3]+"   "+p2[3]);
                price=p2[3];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else if(ch==4)// LG
        {
            String v3[]={"ACs","Refidgerators","Washing Machine"};
            int p3[]={25000,34999,16000};
            System.out.println("\f");
            System.out.println("Models:-");
            for(y=0;y<3;y++)
            {
                System.out.println((y+1)+". "+v3[y]+"   "+p3[y]);
            }
            System.out.println();
            System.out.println("Select Model (enter only serial no.)");
            ch2=sc.nextInt();
            System.out.println();
            
            if(ch2==1)
            {
                pr=c[3]+"   "+v3[0]+"   "+p3[0];
                System.out.println(v3[0]+"   "+p3[0]);
                price=p3[0];
            }
            else if(ch2==2)
            {
                pr=c[3]+"   "+v3[1]+"   "+p3[1];
                System.out.println(v3[1]+"   "+p3[1]);
                price=p3[1];
            }
            else if(ch2==3)
            {
                pr=c[3]+"   "+v3[2]+"   "+p3[2];
                System.out.println(v3[2]+"   "+p3[2]);
                price=p3[2];
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
            
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your First Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch1=sc.next();
        
        if(ch1.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
        }
    }
    
    public void StorageDevices()
    {
        String t[]={"Pen Drive","Memory Card","External Hard Drive"};
        int x, y;
        int ch, ch2, ch3;
        String ch1;
        System.out.println("\f");
        System.out.println("Brands:-");
        for(x=0;x<3;x++)
        {
            System.out.println((x+1)+". "+t[x]);
        }
        System.out.println();
        System.out.println("Select Type (enter only serial no.)");
        ch=sc.nextInt();
        System.out.println();
        
        if(ch==1)// Pen Drives
        {
            String c[]={"SanDisk","Kingston","HP","Sony"};
            System.out.println("\f");
            System.out.println("Brands:-");
            for(y=0;y<4;y++)
            {
                System.out.println((y+1)+". "+c[y]);
            }
            System.out.println();
            System.out.println("Select Brand (enter only serial no.)");
            ch2=sc.nextInt();
            System.out.println();
            
            if(ch2==1)// SanDisk
            {
                String s[]={"16 GB","32 GB","64 GB"};
                int p[]={280,400,900};
                
                System.out.println("\f");
                System.out.println("Storage Sizes:-");
                for(y=0;y<3;y++)
                {
                    System.out.println((y+1)+". "+s[y]+"   "+p[y]);
                }
                System.out.println();
                System.out.println("Select Size (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
            
                if(ch3==1)
                {
                    pr=t[0]+"   "+c[0]+"   "+s[0];
                    System.out.println(s[0]+"   "+p[0]);
                    price=p[0];
                }
                else if(ch3==2)
                {
                    pr=t[0]+"   "+c[0]+"   "+s[1];
                    System.out.println(s[1]+"   "+p[1]);
                    price=p[1];
                }
                else if(ch3==3)
                {
                    pr=t[0]+"   "+c[0]+"   "+s[2];
                    System.out.println(s[2]+"   "+p[2]);
                    price=p[2];
                }
                else
                {   
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                }                               
            }
            else if(ch2==2)// Kingston
            {
                String s1[]={"16 GB","32 GB","64 GB"};
                int p1[]={280,500,1100};
                System.out.println("\f");
                System.out.println("Storage Sizes:-");
                for(y=0;y<3;y++)
                {
                    System.out.println((y+1)+". "+s1[y]+"   "+p1[y]);
                }
                System.out.println();
                System.out.println("Select Size (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
            
                if(ch3==1)
                {
                    pr=t[0]+"   "+c[1]+"   "+s1[0];
                    System.out.println(s1[0]+"   "+p1[0]);
                    price=p1[0];
                }
                else if(ch3==2)
                {
                    pr=t[0]+"   "+c[1]+"   "+s1[1];
                    System.out.println(s1[1]+"   "+p1[1]);
                    price=p1[1];
                }
                else if(ch3==3)
                {
                    pr=t[0]+"   "+c[1]+"   "+s1[2];
                    System.out.println(s1[2]+"   "+p1[2]);
                    price=p1[2];
                }
                else
                {   
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                }
            }
            else if(ch2==3)// HP
            {
                String s2[]={"16 GB","32 GB","64 GB"};
                int p2[]={320,550,1199};
                System.out.println("\f");
                System.out.println("Storage Sizes:-");
                for(y=0;y<3;y++)
                {
                    System.out.println((y+1)+". "+s2[y]+"   "+p2[y]);
                }
                System.out.println();
                System.out.println("Select Size (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
            
                if(ch3==1)
                {
                    pr=t[0]+"   "+c[2]+"   "+s2[0];
                    System.out.println(s2[0]+"   "+p2[0]);
                    price=p2[0];
                }
                else if(ch3==2)
                {
                    pr=t[0]+"   "+c[2]+"   "+s2[1];
                    System.out.println(s2[1]+"   "+p2[1]);
                    price=p2[1];
                }
                else if(ch3==3)
                {
                    pr=t[0]+"   "+c[2]+"   "+s2[2];
                    System.out.println(s2[2]+"   "+p2[2]);
                    price=p2[2];
                }
                else
                {   
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                }
            }
            else if(ch2==4)// Sony
            {
                String s3[]={"16 GB","32 GB","64 GB"};
                int p3[]={280,449,849};
                System.out.println("\f");
                System.out.println("Storage Sizes:-");
                for(y=0;y<3;y++)
                {
                    System.out.println((y+1)+". "+s3[y]+"   "+p3[y]);
                }
                System.out.println();
                System.out.println("Select Size (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
            
                if(ch3==1)
                {
                    pr=t[0]+"   "+c[3]+"   "+s3[0];
                    System.out.println(s3[0]+"   "+p3[0]);
                    price=p3[0];
                }
                else if(ch3==2)
                {
                    pr=t[0]+"   "+c[3]+"   "+s3[1];
                    System.out.println(s3[1]+"   "+p3[1]);
                    price=p3[1];
                }
                else if(ch3==3)
                {
                    pr=t[0]+"   "+c[3]+"   "+s3[2];
                    System.out.println(s3[2]+"   "+p3[2]);
                    price=p3[2];
                }
                else
                {   
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                }
            }
            else
            {   
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
        }
        else if(ch==2)// Memory Card
        {
            String c[]={"SanDisk","Samsung","Sony"};
            System.out.println("\f");
            System.out.println("Variants:-");
            for(y=0;y<3;y++)
            {
                System.out.println((y+1)+". "+c[y]);
            }
            System.out.println();
            System.out.println("Select Variant (enter only serial no.)");
            ch2=sc.nextInt();
            System.out.println();
            
            if(ch2==1)// SanDisk
            {
                String s[]={"16 GB","32 GB","64 GB"};
                int p[]={330,499,949};
                System.out.println("\f");
                System.out.println("Storage Sizes:-");
                for(y=0;y<3;y++)
                {
                    System.out.println((y+1)+". "+s[y]+"   "+p[y]);
                }
                System.out.println();
                System.out.println("Select Size (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
            
                if(ch3==1)
                {
                    pr=t[0]+"   "+c[0]+"   "+s[0];
                    System.out.println(s[0]+"   "+p[0]);
                    price=p[0];
                }
                else if(ch3==2)
                {
                    pr=t[0]+"   "+c[0]+"   "+s[1];
                    System.out.println(s[1]+"   "+p[1]);
                    price=p[1];
                }
                else if(ch3==3)
                {
                    pr=t[0]+"   "+c[0]+"   "+s[2];
                    System.out.println(s[2]+"   "+p[2]);
                    price=p[2];
                }
                else
                {   
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                }                               
            }
            else if(ch2==2)// Samsung
            {
                String s1[]={"16 GB","32 GB","64 GB"};
                int p1[]={299,499,949};
                System.out.println("\f");
                System.out.println("Storage Sizes:-");
                for(y=0;y<3;y++)
                {
                    System.out.println((y+1)+". "+s1[y]+"   "+p1[y]);
                }
                System.out.println();
                System.out.println("Select Size (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
            
                if(ch3==1)
                {
                    pr=t[0]+"   "+c[1]+"   "+s1[0];
                    System.out.println(s1[0]+"   "+p1[0]);
                    price=p1[0];
                }
                else if(ch3==2)
                {
                    pr=t[0]+"   "+c[1]+"   "+s1[1];
                    System.out.println(s1[1]+"   "+p1[1]);
                    price=p1[1];
                }
                else if(ch3==3)
                {
                    pr=t[0]+"   "+c[1]+"   "+s1[2];
                    System.out.println(s1[2]+"   "+p1[2]);
                    price=p1[2];
                }
                else
                {   
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                }
            }
            else if(ch2==3)// Sony
            {
                String s2[]={"16 GB","32 GB","64 GB"};
                int p2[]={399,710,1099};
                System.out.println("\f");
                System.out.println("Storage Sizes:-");
                for(y=0;y<3;y++)
                {
                    System.out.println((y+1)+". "+s2[y]+"   "+p2[y]);
                }
                System.out.println();
                System.out.println("Select Size (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
            
                if(ch3==1)
                {
                    pr=t[0]+"   "+c[2]+"   "+s2[0];
                    System.out.println(s2[0]+"   "+p2[0]);
                    price=p2[0];
                }
                else if(ch3==2)
                {
                    pr=t[0]+"   "+c[2]+"   "+s2[1];
                    System.out.println(s2[1]+"   "+p2[1]);
                    price=p2[1];
                }
                else if(ch3==3)
                {
                    pr=t[0]+"   "+c[2]+"   "+s2[2];
                    System.out.println(s2[2]+"   "+p2[2]);
                    price=p2[2];
                }
                else
                {   
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                }
            }
            else
            {   
                System.out.println();
                System.out.println("Invalid Entry... Please Try Again");
                Invalid();
            }
        }
        else if(ch==3)// External Hard Drives
        {
            String c[]={"Seagate","Western Digital"};
            System.out.println("\f");
            System.out.println("Brands:-");
            for(y=0;y<2;y++)
            {
                System.out.println((y+1)+". "+c[y]);
            }
            System.out.println();
            System.out.println("Select Brand (enter only serial no.)");
            ch2=sc.nextInt();
            System.out.println();
            
            if(ch2==1)// Seagate
            {
                String s[]={"1 TB","2 TB","4 TB"};
                int p[]={3799,5099,8099};
                
                System.out.println("\f");
                System.out.println("Storage Sizes:-");
                for(y=0;y<3;y++)
                {
                    System.out.println((y+1)+". "+s[y]+"   "+p[y]);
                }
                System.out.println();
                System.out.println("Select Size (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
            
                if(ch3==1)
                {
                    pr=t[2]+"   "+c[0]+"   "+s[0];
                    System.out.println(s[0]+"   "+p[0]);
                    price=p[0];
                }
                else if(ch3==2)
                {
                    pr=t[0]+"   "+c[0]+"   "+s[1];
                    System.out.println(s[1]+"   "+p[1]);
                    price=p[1];
                }
                else if(ch3==3)
                {
                    pr=t[0]+"   "+c[0]+"   "+s[2];
                    System.out.println(s[2]+"   "+p[2]);
                    price=p[2];
                }
                else
                {   
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                }                               
            }
            else if(ch2==2)// WD
            {
                String s1[]={"1 TB","2 TB","4 TB"};
                int p1[]={3599,5000,7999};
                System.out.println("\f");
                System.out.println("Storage Sizes:-");
                for(y=0;y<3;y++)
                {
                    System.out.println((y+1)+". "+s1[y]+"   "+p1[y]);
                }
                System.out.println();
                System.out.println("Select Size (enter only serial no.)");
                ch3=sc.nextInt();
                System.out.println();
            
                if(ch3==1)
                {
                    pr=t[2]+"   "+c[1]+"   "+s1[0];
                    System.out.println(s1[0]+"   "+p1[0]);
                    price=p1[0];
                }
                else if(ch3==2)
                {
                    pr=t[2]+"   "+c[1]+"   "+s1[1];
                    System.out.println(s1[1]+"   "+p1[1]);
                    price=p1[1];
                }
                else if(ch3==3)
                {
                    pr=t[2]+"   "+c[1]+"   "+s1[2];
                    System.out.println(s1[2]+"   "+p1[2]);
                    price=p1[2];
                }
                else
                {   
                    System.out.println();
                    System.out.println("Invalid Entry... Please Try Again");
                    Invalid();
                }
            }
        }
        else
        {   
            System.out.println();
            System.out.println("Invalid Entry... Please Try Again");
            Invalid();
        }
        System.out.println();
        System.out.println("Enter Your First Name");
        nm=sc.next();
        System.out.println("Enter Your Last Name");
        nm1=sc.next();
        System.out.println();
        System.out.println("Do you want to Confirm your Order?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch1=sc.next();
        
        if(ch1.equals("y"))
        {
            System.out.println("\f");
            Bill();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Your Order has not been Placed");
        }
        
    }
    
    public void Bill()
    {
        String ch;
        date=new Date();
        date.toString();
        System.out.println("\f");
        sum=(price+(price*18/100));
        int tax=price*9/100;
        long x;
        for(x=1;x<=999999999;x++)
        {
            if(x==1)
            {
                System.out.println("Loading... Please Wait");
            }
            if(x==999999999)
            {
                System.out.println("Done");
            }
        }
        System.out.println("\f");
        System.out.println("INFINITY ELECTRONICS");
        System.out.println("     Tax Invoice");
        System.out.println();
        System.out.println("Name      = "+nm+" "+nm1);
        System.out.println("Date/Time = "+date);
        System.out.println("Category  = "+cr);
        System.out.println("Product   = "+pr);
        System.out.println("Price     = "+price);
        System.out.println("SubTotal  = "+price);
        System.out.println("CGST      = "+"9%");
        System.out.println("SGST      = "+"9%");
        System.out.println("CGST Amt  = "+tax);
        System.out.println("SGST Amt  = "+tax);
        System.out.println("Total     = "+sum);
        System.out.println();
        System.out.println();
        System.out.println("Thank You for Shopping with us");
        System.out.println();
        System.out.println("Continue Shopping?");
        System.out.println("If YES, then enter 'y'... If NO, then enter 'n'");
        ch=sc.next();
        System.out.println();
        if(ch.equals("y"))
        {
            System.out.println("\f");
            Products();
        }
        else
        {
            System.out.println("\f");
            System.out.println("Thank You... Visit Again");
        }
    }
    
    public void Invalid()
    {
        System.out.println();
        System.out.println("Do you want to restart?");
        System.out.println("If YES, enter 'y'... If NO, enter 'n'");
        String choice;
        choice=sc.next();
        if(choice.equals("y"))
        {
            System.out.println("\f");
            Products();
        }
        else if(choice.equals("n"))
        {
            System.out.println("\f");
            System.out.println("Thank You... Visit Again");
        }
        else
        {
            System.out.println("\f");
            System.out.println("Invalid Choice Entered... Please Try Again");
            Invalid();
        }
    }
}
// Written by KUSH PATEL
