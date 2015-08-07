/**
 * Created by Santiesteban on 8/2/15.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Structure {
    public static int EL = 39, NO = 88, NV = 57, G= 28, R = 77, LL = 0, VB = 0, B = 0;
    public static int [] F = new int[70];
    public static String [] X = new String[6];
    public static String [] Y = new String[6];
    public static String rString = "", dString = "", bString = "", jString ="", oString = "", pString = "",
            fString= "", lString = "", iString = "", vString = "", tString = "", uString = "";
    public static String [] gString = new String[2];
    public static int [] C = new int[G];
    public static String [] E = new String[80];
    public static ArrayList<String> Data = new ArrayList<>(Arrays.asList(("11UNA TUMBA MEDIO ABIERTA,12EL CEMENTERIO DE LOS DUENDES,11EL HUECO DE UNA TUMBA," +
            "23ALGUNAS ESTALACTITAS Y ESTALAGMITAS,11UN LABERINTO DE TUNELES,11UNA CUEVA ABOVEDADA,23LAS ALTAS PUERTAS DE CRISTAL," +
            "12UNA HABITACION DE ENTRADA AL PALACIO,31EL PUESTO DEL CENTINELA GRARG,12LA HABITACION DE GUARDA,31LA ENSENADA PANTANOSA," +
            "23UNAS PUERTAS OXIDADAS,12LA CASITA DEL GUARDIAN DEL JUEGO,31EL ESTANQUE CON NIEBLA,11UN JARDIN CON ALTOS MUROS," +
            "14UNA CUEVA CON INSCRIPCIONES,34UNA FUENTE ADORNADA,11UN HUMEDO PASADIZO,12UNA LARGA GALERIA," +
            "12LAS COCINAS DEL PALACIO,34UN VIEJO HORNO,44UN CAMINO LLENO DE MALEZA,31UNA NORIA ESTROPEADA,33LAS COMPUERTAS DEL ESTANQUE," +
            "11UN BOQUETE ENTRE ALGUNAS ROCAS,41UN CAMINO PELIGROSO,31LA CAMPANA DE PLATA EN LA ROCA,12LAS MAZMORRAS DE PALACIO," +
            "11LA SALA DE BANQUETES,42LAS TORRES DE PALACIO,44LA COSTA DE LA ISLA,31UNA BARCA DE VELA ENCALLADA,13UN CAMPO SECO," +
            "33UNOS SACOS EN EL PISO SUPERIOR,46EL ESTANQUE HELADO,21LA CABAÑA DE LA MONTAÑA,31UNA HILERA DE BARRILES,11LA BODEGA DE VINO," +
            "12LA HABITACION DE LOS TAPICES,11UNA BIBLIOTECA POLVORIENTA,13MEDIO DE UNAS AGUAS SALVAJES,11UN CAMPO ARADO," +
            "55EN EL EXTERIOR DE UN MOLINO DE VIENTO,42EN LA PLANTA BAJA DEL MOLINO,44UN CAMINO HELADO,41UN CAMINO INCLINADO Y PEDREGOSO," +
            "12 LA CAMARA DE PLATA,12LA CUEVA DEL MAGO,11LA HABITACION DE LOS MOSAICOS FLORIDOS,12LA HABITACION DEL TRONO DE PLATA," +
            "12MEDIO DEL LAGO, 42LA ORILLA DE UN LAGO HELADO,41UN CAMINO LLENO DE BACHES,41LO ALTO DEL PINACULO,55SOBRE UN GLACIAR," +
            "21UNOS ENORMES ROBLES CAIDOS,11UNA HABITACION CON UNA MAQUINA TRAGAPERRAS,11LA HABITACION CON TELAS DE ARAÑA," +
            "31UNA CAJA FUERTE EN LA CAMARA DE OGBAN,31UN ARMARIO EN UNA ESQUINA,11UN PASADIZO ESTRECHO,16HUECO EN EL PASADIZO," +
            "11LA CABAÑA DEL LEÑADOR,42LA LADERA DEL VALLE CON ARBOLES,21EL ARROYO EN EL FONDO DEL VALLE,11UN PROFUNDO Y OSCURO BOSQUE," +
            "11 UN SOMBRIO AGUJERO,34UN CIRCULO DE ANTIQUIS MAS PIEDRAS,16ESTABLO,14EL DORMITORIO DEL ATICO,11EL HUMEDO FONDO DEL POZO," +
            "32UN PROFUNDO POZO,31UNA HOGERA APAGADA,16HUERTO,62EL FINAL DEL PUENTE,62EL FINAL DEL PUENTE,61UN CRUCE DE CAMINOS," +
            "41UN CAMINO SERPENTEANTE,11UN PUEBLO DE RUSTICAS CASAS,11UNA CASITA BLANCA,3MONEDAS,1SABANA,3BOTAS,1HERRADURA," +
            "3MANZANAS,1CUBO,4HACHA,1BOTE,1FRASCO,3JUNCOS,1HUESO,1ESCUDO,3TABLAS,1CUERDA,1ANILLO,1JARRA,1RED,1ESPADA,1BANDEJA DE PLATA," +
            "1UNIFORME,1LLAVE,3SEMILLAS,1LAMPARA,3PAN,1BROCHES,3CERILLAS,2PIEDRA DEL DESTINO,4MANZANA,CAMA,ARMARIO,PUENTE,ARBOLES,VELA," +
            "HORNO,BARCA DE VELA,LADRILLOS,MOLINO DE VIENTO,SACOS,JABALI DE OGBAN,RUEDA,PONY,LAPIDAS,ESTANQUES,PUERTAS,MANILLA,CABAÑA," +
            "ENREDADERA,INSCRIPCIONES,TROLL,TIERRA,BESTIA,FUENTE,CIRCULO,MOSAICOS,LIBROS,BARRILES,POZO,MUROS,RATAS,CAJA FUERTE," +
            "TELAS DE ARAÑA,MONEDA,CAMPANA,BANDEJA DE PLATA,PIEDRAS,COCINAS,COPA,VINO,GRARGS,PUERTA,VIGILA,GUIA,PROTEGE,DIRIGE,AYUDA," +
            "COFRE,AGUA,ESTABLOS,COMPUERTAS,OLLA,ESTATUA,PINACULO,MUSICA,PALABRAS MAGICAS,ESTANQUE CON NIBLA,FONDO DEL POZO,VIEJO HORNO," +
            "CABAÑA DE LA MONTAÑA,             EN,  ,CERCA DE,  ,AL LADO DE,   ,EN,  ,,,EN,UN PEQUEÑO,E,ESO,OE,EO,EO,ESO,ESO,ES,EO,SO,S,N," +
            "ES,SO,S,NO,N,N,ES,NSO,NS,E,NSO,N,NES,EO,O,S,NS,N,NES,O,NS,A,NES,SO,E,NO,NS,S,NS,E,NSEO,OR,RA,NS,E,SO,NSE,NO,NE,EO,NSO,E,ON,S,E," +
            "NEO,NO,S,ES,SO,NES,EO,SO,NE,ESO,ESO,SO,NA,.,E,NEO,EO,NEO,EO,EO,NEO,NEO,OR,80,70,60,69,74,72,63,52,20,11,1,14,36,54,61,21,32,10,50," +
            "29,59,34,13,80,30,81,47,74,1,2,3,4,5,9,12,13,16,17,20,21,22").split(",")));

    public static void main(String [] args){
        menu();
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        int opcs = 0;
        String D = Data.get(79);
        String T = Data.get(167);
        for(int i=1,pos=0;pos<6;i+=2,pos++){
            X[pos] = Data.get(167+i);
            Y[pos] = Data.get(168+i);
        }
        bString = "NOOEOOSOOOOOROOAOOINVOBTTOMEXALEEDARDECRECPONATAESCIZAUSAABR" +
                "ENCLLEPLAREGBLAVACENTATRQUIALIGIRSUMRESDEJARRINSSOPTIRCOMMOV" +
                "DENREPCORSOSQUEENVMOSEMPCONBEBCONPAGHACROMROBREUREF";
        String X6 = "SFGMFKBT MB QFOFUSBOUF NJSBEB EFM NBHP! FM NVFSF";
        String X1 = "EL FANTASMA DEL DUENDE GUARDIAN";
        String X2 = "VOB FOPSNF FOSFEBEFSB DSFDF FO TFHVOEPT!";
        String X3 = "UNA PATRULLA DE GRARS SE APROXIMA";
        String X4 = "LAS PALABRAS MAGICAS SE HALLAN EN EL CRUCE, LA FUENTE Y EN ";
        String X5 = "UN MONTON DE TIERRA BLOQUEA TU CAMINO";
        String X7 = "LA MONTAÑA RETUMBA!";
        String X8 = "LAS TORRES SE CAEN!";
        String X9 = "EL MAGO TE MIRA FIJAMENTE";
        String XB = "﻿TE GUIA HACIA EL ";
        header();
        //System.out.println(Data.get(167));
        System.out.println("QUE QUIERES?");
        System.out.println("\n  1. EMPEZAR UN JUEGO NUEVO");
        System.out.println("O 2. CONTINUAR UN JUEGO SALVADO\n");
        do {
            System.out.print("INTRODUCE UN 1 O UN 2");
            opcs = sc.nextInt();

            switch (opcs) {
                case 1:
                    newGame();
                    break;
                case 2:
                    loadGame();
            }
        }while(opcs!=1 && opcs!=2);
    }
    public static void header(){
        System.out.println("\tMISTERIO DE LA MONTANA");
        System.out.println("\tDE PLATA");
        System.out.println("==================================\n");
    }
    public static void newGame() {
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            E[i] = Data.get(180 + i);
        }
        for (int i = 0; i < G; i++) {
            C[i] = Integer.valueOf(Data.get(260 + i));
        }
        for (int i = 0; i < 13; i++) {
            F[Integer.valueOf(Data.get(288 + i)) - 1] = 1;
        }
        F[40] = r.nextInt(900) + 100;
        F[41] = r.nextInt(3) + 2;
        F[43] = 4;
        F[56] = 68;
        F[57] = 54;
        F[58] = 15;
        F[51] = r.nextInt(3);
        rString = "BUENA SUERTE EN TU MISION!";
        //gString[0]="";
        for (int i = 0; i < 8; i++) {
            int random = r.nextInt(4) * 3;
            fString = bString.substring(random, random + 1);
            gString[0] = gString[0] + fString;
            if (fString.equals("N")) lString = "S";
            if (fString.equals("S")) lString = "N";
            if (fString.equals("E")) lString = "O";
            if (fString.equals("O")) lString = "E";
            gString[1] = lString + gString[1];
        }
        l30();
    }
    public static void l30(){
        Scanner sc = new Scanner(System.in);
        header();
        dString = Data.get(76);
        pString = X[Integer.valueOf(dString.substring(0,1))-1] + " " + Y[Integer.valueOf(dString.substring(1,2))-1] + " ";
        jString = rString + ". " + "ESTAS " + pString + dString.substring(2);
        l4830();
        jString= "";
        oString = Data.get(106).substring(1);
        pString = Y[Integer.valueOf(Data.get(106).substring(0,1))-1];
        if(F[26]==0 && C[26]==R) jString += " " + pString + " " + oString + " ," ;
        if(R==29 && F[47]==0){
            jString += " UNA FIESTA DE LOS GRAGRS,";
        }else if (R == 29 && F[47]==1){
            jString += " UN GRARG DORMIDO,";
        }else if(R==12 || R==22){
            jString += "UN PONY,";
        }else if(R==64){
            jString +="A UN ERMITANO,";
        }else if(R==18 && E[17].equals("N")){
            jString += "UNA PUERTA DE ROBLE,";
        }else if(R==59 && F[67]==1){
            jString += " OGBAN (MUERTO),";
        }
        if(!jString.equals(""))jString = ",PUEDES VER" + jString;
        jString += " PUEDES IR AL";
        l4830();
        for(int i=0;i<E[R-1].length();i++){
            System.out.print(E[R-1].substring(i,i+1)+ ".");
        }
        rString = "PERDON?";
        System.out.println("\n\n==================================\n\n\nQUE HARAS AHORA?");
        iString = sc.nextLine();
        if(iString.equals("SALVAR JUEGO"))salvarJuego();
        for(int i=0;i<iString.length()-1;i++){
            if(iString.substring(i,i+1).equals(" ") && vString.equals("")) vString = iString.substring(0,i);
            if(!iString.substring(i+1,i+2).equals(" ") && !vString.equals("")){
                tString =  iString.substring(i+1);
                i = iString.length();
            }
        }
        if(tString.equals(""))vString = iString;
        if (vString.length()<3) do{
            vString += "O";
        }while(vString.length()<3);
        if(vString.equals("PLAY")) vString = "BLO";
        uString = vString.substring(0,3);
        for(int pos=0, i=0;i<NV;pos+=3,i++){
            if(bString.substring(pos,pos+3).equals(uString)){
                VB =i+1;
                i=NV;
            }
        }
        F[35]=0;
        //oString = Data.get(167);
}
    public static void loadGame(){
        System.out.print(Data.get(0));
    }
    public static void l4830(){
        int LS =1;
        int LP = 0;
        for(int i= 0;i<jString.length();i++){
            if(jString.substring(i,i+1).equals(" ") && LL > EL){
                System.out.println(jString.substring(LP,LS-LP));
                LL = i - LS;
                LP = LS + 1;
            }
            if(jString.substring(i,i+1).equals(" ")){
                LS = i;
                LL++;
            }
        }
        System.out.println((jString.substring(LP, jString.length() - LP) + " ").replaceAll("\\s+", " "));
    }
    public static void salvarJuego(){
        System.out.println("SALVANDO JUEGO");
    }
}