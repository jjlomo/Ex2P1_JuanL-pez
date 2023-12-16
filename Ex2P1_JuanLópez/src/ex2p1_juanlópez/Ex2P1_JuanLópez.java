/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2p1_juanlópez;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author jjlm1
 */
//FILA 1 PUESTO 11
public class Ex2P1_JuanLópez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Random rand=new Random();
        double hp;
        double mp;
        double atacpoints;
        double defenpoints;
        String nombre;
        System.out.println("********************KINGDOM HEARTS********************");
        System.out.println("");
        int cont=0;
        char resp='s';
        ArrayList <Personaje> personajes=new ArrayList<>();
        personajes.add(new Personaje("Sora",300,300,75,0.15));
        personajes.add(new Personaje("Donald",150,450,45, 0.10));
        personajes.add(new Personaje("Goofy",450,100,150,0.50));
        ArrayList <Personaje> reserve=new ArrayList<>();
        reserve.add(new Personaje("Mickey",100,500,150,0.35));
        reserve.add(new Personaje("Roxas",300,300,15,0.75));
        reserve.add(new Personaje("Kairi",200,200,50,0.15));
        ArrayList <Personaje> ddreserve=new ArrayList<>();
        ddreserve.add(new Personaje("Sora",300,300,75,0.15));
        ddreserve.add(new Personaje("Donald",150,450,45, 0.10));
        ddreserve.add(new Personaje("Goofy",450,100,150,0.50));
        ArrayList <Items> items=new ArrayList<>();
        items.add(new Items("Poción", 50, 0));
        items.add(new Items("Ether", 0, 50));
        items.add(new Items("Elixir", 100, 100));
        while (cont<20||(resp=='s'||resp=='S')){
            System.out.println("Cuarto No."+(cont+1));
            int cuarto=rand.nextInt((5))+1;
            switch (cuarto){
                case 1:
                    int less=rand.nextInt(3)+1;
                    System.out.println("Te has encontrado :"+less+" heartless!!");
                    int vidah=75*less;
                    int atah=25*less;
                    while(vidah>0&&personajes.size()>0){
                        System.out.println("");        
                        if (personajes.size()>0){
                                nombre=personajes.get(0).getnombre();
                                hp = personajes.get(0).gethp();
                                atacpoints=personajes.get(0).getatac();
                                defenpoints=personajes.get(0).getdefen();
                                mp=personajes.get(0).getmp();
                                System.out.println(nombre);
                                System.out.println("HP="+hp);
                                System.out.println("MP="+mp);
                                System.out.println("Ataque="+atacpoints);
                                System.out.println("Defensa="+defenpoints);
                                }
                                System.out.println("");
                                if(personajes.size()>1){
                                nombre=personajes.get(1).getnombre();
                                hp = personajes.get(1).gethp();
                                atacpoints=personajes.get(1).getatac();
                                defenpoints=personajes.get(1).getdefen();
                                mp=personajes.get(1).getmp();
                                System.out.println(nombre);
                                System.out.println("HP="+hp);
                                System.out.println("MP="+mp);
                                System.out.println("Ataque="+atacpoints);
                                System.out.println("Defensa="+defenpoints);
                                }
                                System.out.println("");
                                if(personajes.size()>2){
                                nombre=personajes.get(2).getnombre();
                                hp = personajes.get(2).gethp();
                                atacpoints=personajes.get(2).getatac();
                                defenpoints=personajes.get(2).getdefen();
                                mp=personajes.get(2).getmp();
                                System.out.println(nombre);
                                System.out.println("HP="+hp);
                                System.out.println("MP="+mp);
                                System.out.println("Ataque="+atacpoints);
                                System.out.println("Defensa="+defenpoints);
                                }
                        System.out.println("Decida personaje");
                        int perso=leer.nextInt();
                        switch (perso){
                            case 0:
                                personajes.get(0);
                                hp = personajes.get(0).gethp();
                                atacpoints=personajes.get(0).getatac();
                                defenpoints=personajes.get(0).getdefen();
                                mp=personajes.get(0).getmp();
                                System.out.println("Decida movimiento");
                                System.out.println("1. Ataque");
                                System.out.println("2. Mágico");
                                System.out.println("3. Items");
                                System.out.println("4. Party");
                                int mov=leer.nextInt();
                                switch(mov){
                                    case 1:
                                        vidah-=atacpoints;
                                        if (vidah<0){
                                            vidah=0;
                                        }
                                        System.out.println("Se ha atacado");
                                        System.out.println("Vida de los heartless: "+vidah);
                                        double ataque=ataquemaq(defenpoints, atah);
                                            hp-=ataque;
                                            if (hp<=0){
//                                                hp=0;
                                                personajes.remove(0);
//                                                personajes.get(0).sethp(hp);
                                            }else{
                                            personajes.get(0).sethp(hp);
                                            }
                                        break;
                                    case 2:
                                        System.out.println("1. Blizzard 50MP - 50 DMG");
                                        System.out.println("2. Firaga 25MP - 25DMG");
                                        System.out.println("3. Gravity 75MP - 100DMG");
                                        int movi=leer.nextInt();
                                        if (movi==1&&mp-50>=0){
                                            vidah-=50;
                                            mp-=50;
                                            if (vidah<0){
                                            vidah=0;
                                        }
                                             ataque=ataquemaq(defenpoints, atah);
                                            hp-=ataque;
                                            if (hp<=0){
//                                                hp=0;
                                                personajes.remove(0);
//                                                personajes.get(0).sethp(hp);
                                            }else{
                                            personajes.get(0).sethp(hp);
                                            }
                                            System.out.println("Se ha atacado con blizzard");
                                        System.out.println("Vida de los heartless: "+vidah);
                                            personajes.get(0).setmp(mp);
                                        }else if(movi==2&&mp-25>=0){
                                            vidah-=25;
                                            mp-=25;
                                            if (vidah<0){
                                            vidah=0;
                                        }
                                             ataque=ataquemaq(defenpoints, atah);
                                            hp-=ataque;
                                            if (hp<=0){
//                                                hp=0;
                                                personajes.remove(0);
//                                                personajes.get(0).sethp(hp);
                                            }else{
                                            personajes.get(0).sethp(hp);
                                            }
                                            System.out.println("Se ha atacado con firaga");
                                        System.out.println("Vida de los heartless: "+vidah);
                                            personajes.get(0).setmp(mp);
                                        }else if(movi==3&&mp-75>=0){
                                            vidah-=100;
                                            mp-=75;
                                            if (vidah<0){
                                            vidah=0;
                                        }
                                             ataque=ataquemaq(defenpoints, atah);
                                            hp-=ataque;
                                            if (hp<=0){
//                                                hp=0;
                                                personajes.remove(0);
//                                                personajes.get(0).sethp(hp);
                                            }else{
                                            personajes.get(0).sethp(hp);
                                            }
                                            System.out.println("Se ha atacado con gravity");
                                        System.out.println("Vida de los heartless: "+vidah);
                                            personajes.get(0).setmp(mp);
                                        }else{
                                            System.out.println("La magia restante es insuficiente");
                                        }
                                        break;
                                    case 3:
                                        impri(items);
                                        int item=leer.nextInt();
                                        for (int i=0;i<items.size();i++){
                                        String nom=items.get(i).getnombre();
                                        String hpp=String.valueOf(items.get(i).gethp());
                                        String mpp=String.valueOf(items.get(i).getmp());
                                        if (item==i){
                                            hp+=items.get(i).gethp();
                                            mp+=items.get(i).getmp();
                                            items.get(i).sethp(hp);
                                            items.get(i).setmp(mp);
                                            ataque=ataquemaq(defenpoints, atah);
                                            hp-=ataque;
                                            personajes.get(0).sethp(hp);
                                            personajes.get(0).setmp(mp);
                                            items.remove(i);
                                        }
                                        }
                                        break;
                                        case 4:
                                    System.out.println("");
                                nombre=reserve.get(0).getnombre();
                                hp = reserve.get(0).gethp();
                                atacpoints=reserve.get(0).getatac();
                                defenpoints=reserve.get(0).getdefen();
                                mp=reserve.get(0).getmp();
                                System.out.println(nombre);
                                System.out.println("HP="+hp);
                                System.out.println("MP="+mp);
                                System.out.println("Ataque="+atacpoints);
                                System.out.println("Defensa="+defenpoints);
                                    System.out.println("");
                                nombre=reserve.get(1).getnombre();
                                hp = reserve.get(1).gethp();
                                atacpoints=reserve.get(1).getatac();
                                defenpoints=reserve.get(1).getdefen();
                                mp=reserve.get(1).getmp();
                                System.out.println(nombre);
                                System.out.println("HP="+hp);
                                System.out.println("MP="+mp);
                                System.out.println("Ataque="+atacpoints);
                                System.out.println("Defensa="+defenpoints);
                                    System.out.println("");
                                nombre=reserve.get(2).getnombre();
                                hp = reserve.get(2).gethp();
                                atacpoints=reserve.get(2).getatac();
                                defenpoints=reserve.get(2).getdefen();
                                mp=reserve.get(2).getmp();
                                System.out.println(nombre);
                                System.out.println("HP="+hp);
                                System.out.println("MP="+mp);
                                System.out.println("Ataque="+atacpoints);
                                System.out.println("Defensa="+defenpoints);
                                    System.out.println("");
                                System.out.println("Indique a quién meter");
                                int cambio=leer.nextInt();
                                
                                personajes.set(0, reserve.get(cambio));
                                reserve.set(cambio, ddreserve.get(cambio));
                                    break;
                                }
                                break;
                            case 1:
                                personajes.get(1);
                                hp = personajes.get(1).gethp();
                                atacpoints=personajes.get(1).getatac();
                                defenpoints=personajes.get(1).getdefen();
                                mp=personajes.get(1).getmp();
                                System.out.println("Decida movimiento");
                                System.out.println("1. Ataque");
                                System.out.println("2. Mágico");
                                System.out.println("3. Items");
                                System.out.println("4. Party");
                                mov=leer.nextInt();
                                switch(mov){
                                    case 1:
                                        vidah-=atacpoints;
                                        if (vidah<0){
                                            vidah=0;
                                        }
                                        System.out.println("Se ha atacado");
                                        System.out.println("Vida de los heartless: "+vidah);
                                        double ataque=ataquemaq(defenpoints, atah);
                                            hp-=ataque;
                                            if (hp<=0){
//                                                hp=0;
                                                personajes.remove(1);
//                                                personajes.get(0).sethp(hp);
                                            }else{
                                            personajes.get(1).sethp(hp);
                                            }
                                        break;
                                    case 2:
                                        System.out.println("1. Blizzard 50MP - 50 DMG");
                                        System.out.println("2. Firaga 25MP - 25DMG");
                                        System.out.println("3. Gravity 75MP - 100DMG");
                                        int movi=leer.nextInt();
                                        if (movi==1&&mp-50>=0){
                                            vidah-=50;
                                            mp-=50;
                                            if (vidah<0){
                                            vidah=0;
                                        }
                                             ataque=ataquemaq(defenpoints, atah);
                                            hp-=ataque;
                                            if (hp<=0){
//                                                hp=0;
                                                personajes.remove(1);
//                                                personajes.get(0).sethp(hp);
                                            }else{
                                            personajes.get(1).sethp(hp);
                                            }
                                            System.out.println("Se ha atacado con blizzard");
                                        System.out.println("Vida de los heartless: "+vidah);
                                            personajes.get(1).setmp(mp);
                                        }else if(movi==2&&mp-25>=0){
                                            vidah-=25;
                                            mp-=25;
                                            if (vidah<0){
                                            vidah=0;
                                        }
                                             ataque=ataquemaq(defenpoints, atah);
                                            hp-=ataque;
                                            if (hp<=0){
//                                                hp=0;
                                                personajes.remove(1);
//                                                personajes.get(0).sethp(hp);
                                            }else{
                                            personajes.get(1).sethp(hp);
                                            }
                                            System.out.println("Se ha atacado con firaga");
                                        System.out.println("Vida de los heartless: "+vidah);
                                            personajes.get(1).setmp(mp);
                                        }else if(movi==3&&mp-75>=0){
                                            vidah-=100;
                                            mp-=75;
                                            if (vidah<0){
                                            vidah=0;
                                        }
                                             ataque=ataquemaq(defenpoints, atah);
                                            hp-=ataque;
                                            if (hp<=0){
//                                                hp=0;
                                                personajes.remove(1);
//                                                personajes.get(0).sethp(hp);
                                            }else{
                                            personajes.get(1).sethp(hp);
                                            }
                                            System.out.println("Se ha atacado con gravity");
                                        System.out.println("Vida de los heartless: "+vidah);
                                            personajes.get(1).setmp(mp);
                                        }else{
                                            System.out.println("La magia restante es insuficiente");
                                        }
                                        break;
                                        case 3:
                                        impri(items);
                                        int item=leer.nextInt();
                                        for (int i=0;i<items.size();i++){
                                        String nom=items.get(i).getnombre();
                                        String hpp=String.valueOf(items.get(i).gethp());
                                        String mpp=String.valueOf(items.get(i).getmp());
                                        if (item==i){
                                            hp+=items.get(i).gethp();
                                            mp+=items.get(i).getmp();
                                            items.get(i).sethp(hp);
                                            items.get(i).setmp(mp);
                                            ataque=ataquemaq(defenpoints, atah);
                                            hp-=ataque;
                                            personajes.get(1).sethp(hp);
                                            personajes.get(1).setmp(mp);
                                            items.remove(i);
                                        }
                                        }
                                        break;
                                        case 4:
                                    System.out.println("");
                                nombre=reserve.get(0).getnombre();
                                hp = reserve.get(0).gethp();
                                atacpoints=reserve.get(0).getatac();
                                defenpoints=reserve.get(0).getdefen();
                                mp=reserve.get(0).getmp();
                                System.out.println(nombre);
                                System.out.println("HP="+hp);
                                System.out.println("MP="+mp);
                                System.out.println("Ataque="+atacpoints);
                                System.out.println("Defensa="+defenpoints);
                                    System.out.println("");
                                nombre=reserve.get(1).getnombre();
                                hp = reserve.get(1).gethp();
                                atacpoints=reserve.get(1).getatac();
                                defenpoints=reserve.get(1).getdefen();
                                mp=reserve.get(1).getmp();
                                System.out.println(nombre);
                                System.out.println("HP="+hp);
                                System.out.println("MP="+mp);
                                System.out.println("Ataque="+atacpoints);
                                System.out.println("Defensa="+defenpoints);
                                    System.out.println("");
                                nombre=reserve.get(2).getnombre();
                                hp = reserve.get(2).gethp();
                                atacpoints=reserve.get(2).getatac();
                                defenpoints=reserve.get(2).getdefen();
                                mp=reserve.get(2).getmp();
                                System.out.println(nombre);
                                System.out.println("HP="+hp);
                                System.out.println("MP="+mp);
                                System.out.println("Ataque="+atacpoints);
                                System.out.println("Defensa="+defenpoints);
                                    System.out.println("");
                                System.out.println("Indique a quién meter");
                                int cambio=leer.nextInt();
                                
                                personajes.set(1, reserve.get(cambio));
                                reserve.set(cambio, ddreserve.get(cambio));
                                    break;
                                }
                                break;
                            case 2:
                                personajes.get(2);
                                hp = personajes.get(2).gethp();
                                atacpoints=personajes.get(2).getatac();
                                defenpoints=personajes.get(2).getdefen();
                                mp=personajes.get(2).getmp();
                                System.out.println("Decida movimiento");
                                System.out.println("1. Ataque");
                                System.out.println("2. Mágico");
                                System.out.println("3. Items");
                                System.out.println("4. Party");
                                mov=leer.nextInt();
                                switch(mov){
                                    case 1:
                                        vidah-=atacpoints;
                                        if (vidah<0){
                                            vidah=0;
                                        }
                                        System.out.println("Se ha atacado");
                                        System.out.println("Vida de los heartless: "+vidah);
                                        double ataque=ataquemaq(defenpoints, atah);
                                            hp-=ataque;
                                            if (hp<=0){
//                                                hp=0;
                                                personajes.remove(2);
//                                                personajes.get(0).sethp(hp);
                                            }else{
                                            personajes.get(2).sethp(hp);
                                            }
                                        break;
                                    case 2:
                                        System.out.println("1. Blizzard 50MP - 50 DMG");
                                        System.out.println("2. Firaga 25MP - 25DMG");
                                        System.out.println("3. Gravity 75MP - 100DMG");
                                        int movi=leer.nextInt();
                                        if (movi==1&&mp-50>=0){
                                            vidah-=50;
                                            mp-=50;
                                            if (vidah<0){
                                            vidah=0;
                                        }
                                             ataque=ataquemaq(defenpoints, atah);
                                            hp-=ataque;
                                            if (hp<=0){
//                                                hp=0;
                                                personajes.remove(2);
//                                                personajes.get(0).sethp(hp);
                                            }else{
                                            personajes.get(2).sethp(hp);
                                            }
                                            System.out.println("Se ha atacado con blizzard");
                                        System.out.println("Vida de los heartless: "+vidah);
                                            personajes.get(2).setmp(mp);
                                        }else if(movi==2&&mp-25>=0){
                                            vidah-=25;
                                            mp-=25;
                                            if (vidah<0){
                                            vidah=0;
                                        }
                                             ataque=ataquemaq(defenpoints, atah);
                                            hp-=ataque;
                                            if (hp<=0){
//                                                hp=0;
                                                personajes.remove(2);
//                                                personajes.get(0).sethp(hp);
                                            }else{
                                            personajes.get(2).sethp(hp);
                                            }
                                            System.out.println("Se ha atacado con firaga");
                                        System.out.println("Vida de los heartless: "+vidah);
                                            personajes.get(2).setmp(mp);
                                        }else if(movi==3&&mp-75>=0){
                                            vidah-=100;
                                            mp-=75;
                                            if (vidah<0){
                                            vidah=0;
                                        }
                                             ataque=ataquemaq(defenpoints, atah);
                                            hp-=ataque;
                                            if (hp<=0){
//                                                hp=0;
                                                personajes.remove(2);
//                                                personajes.get(2).sethp(hp);
                                            }else{
                                            personajes.get(2).sethp(hp);
                                            }
                                            System.out.println("Se ha atacado con gravity");
                                        System.out.println("Vida de los heartless: "+vidah);
                                            personajes.get(2).setmp(mp);
                                        }else{
                                            System.out.println("La magia restante es insuficiente");
                                        }
                                        break;
                                
                                
                                case 3:
                                        impri(items);
                                        int item=leer.nextInt();
                                        for (int i=0;i<items.size();i++){
                                        String nom=items.get(i).getnombre();
                                        String hpp=String.valueOf(items.get(i).gethp());
                                        String mpp=String.valueOf(items.get(i).getmp());
                                        if (item==i){
                                            hp+=items.get(i).gethp();
                                            mp+=items.get(i).getmp();
                                            items.get(i).sethp(hp);
                                            items.get(i).setmp(mp);
                                            ataque=ataquemaq(defenpoints, atah);
                                            hp-=ataque;
                                            personajes.get(2).sethp(hp);
                                            personajes.get(2).setmp(mp);
                                            items.remove(i);
                                        }
                                        }
                                        break;
                                        
                                case 4:
                                    System.out.println("");
                                nombre=reserve.get(0).getnombre();
                                hp = reserve.get(0).gethp();
                                atacpoints=reserve.get(0).getatac();
                                defenpoints=reserve.get(0).getdefen();
                                mp=reserve.get(0).getmp();
                                System.out.println(nombre);
                                System.out.println("HP="+hp);
                                System.out.println("MP="+mp);
                                System.out.println("Ataque="+atacpoints);
                                System.out.println("Defensa="+defenpoints);
                                    System.out.println("");
                                nombre=reserve.get(1).getnombre();
                                hp = reserve.get(1).gethp();
                                atacpoints=reserve.get(1).getatac();
                                defenpoints=reserve.get(1).getdefen();
                                mp=reserve.get(1).getmp();
                                System.out.println(nombre);
                                System.out.println("HP="+hp);
                                System.out.println("MP="+mp);
                                System.out.println("Ataque="+atacpoints);
                                System.out.println("Defensa="+defenpoints);
                                    System.out.println("");
                                nombre=reserve.get(2).getnombre();
                                hp = reserve.get(2).gethp();
                                atacpoints=reserve.get(2).getatac();
                                defenpoints=reserve.get(2).getdefen();
                                mp=reserve.get(2).getmp();
                                System.out.println(nombre);
                                System.out.println("HP="+hp);
                                System.out.println("MP="+mp);
                                System.out.println("Ataque="+atacpoints);
                                System.out.println("Defensa="+defenpoints);
                                    System.out.println("");
                                System.out.println("Indique a quién meter");
                                int cambio=leer.nextInt();
                                
                                personajes.set(2, reserve.get(cambio));
                                reserve.set(cambio, ddreserve.get(cambio));
                                    break;
                                }

                        }
                    }
                    cont++;
                    break;
                case 2:
                    System.out.println("Ha encontrado un cofre con una poción");
                    System.out.println("");
                    items.add(new Items("Poción", 50, 0));
                    impri(items);
                    cont++;
                    break;
                case 3:
                    System.out.println("Ha encontrado un cofre con un ether");
                    items.add(new Items("Ether", 0, 50));
                    impri(items);
                    cont++;
                    break;
                case 4:
                   System.out.println("Ha encontrado un cofre con un elixir"); 
                   items.add(new Items("Elixir", 100, 100));
                   impri(items);
                   cont++;
                   break;
                case 5:
                    if (items.size()>0){
                        int itemmenos=rand.nextInt(items.size())+1;
                   System.out.println("Ha encontrado un grupo de amigos que necesita ayuda!!");
                    System.out.println("El grupo ha tomado "+itemmenos+" de su inventario");
                    for (int i=0;i<itemmenos;i++){
                    items.remove(0);
                    }
                    }else{
                        System.out.println("Ya no hay items que donar");
                    }
                    impri(items);
                    cont++;
                    break;
                
                    
            } 
            if(cont==20){
                System.out.println("Ha superado todos los cuartos!!! FELICIDADES!!!!!");
                System.out.println("Desea REINICIAR?");
            resp=leer.next().charAt(0);
            if(resp=='s'||resp=='S'){
            personajes.clear();
            reserve.clear();
            ddreserve.clear();
            items.clear();
            personajes.add(new Personaje("Sora",300,300,75,0.15));
        personajes.add(new Personaje("Donald",150,450,45, 0.10));
        personajes.add(new Personaje("Goofy",450,100,150,0.50));
        reserve.add(new Personaje("Mickey",100,500,150,0.35));
        reserve.add(new Personaje("Roxas",300,300,15,0.75));
        reserve.add(new Personaje("Kairi",200,200,50,0.15));
        ddreserve.add(new Personaje("Sora",300,300,75,0.15));
        ddreserve.add(new Personaje("Donald",150,450,45, 0.10));
        ddreserve.add(new Personaje("Goofy",450,100,150,0.50));
        items.add(new Items("Poción", 50, 0));
        items.add(new Items("Ether", 0, 50));
        items.add(new Items("Elixir", 100, 100));
            cont=0;
            }
            }else if(personajes.size()==0){
            System.out.println("Ha perdido a toda su bandada :(");
            }
            else{
                System.out.println("Desea continuar?");
                char nada=leer.next().charAt(0);
            }
            
        }
        
    }
    public static double ataquemaq(double defenp, double atac){
        double ataque=atac-atac*defenp;
        return ataque;
    }
    public static void impri(ArrayList<Items> items){
        
        for (int i=0;i<items.size();i++){
            String nom=items.get(i).getnombre();
            String hpp=String.valueOf(items.get(i).gethp());
            String mpp=String.valueOf(items.get(i).getmp());
            System.out.print(i+".- "+nom);
            System.out.print("   HP="+hpp);
            System.out.print("   MP="+mpp);
            System.out.println("");
        }
       
    }
}
