
/**
 * Décrivez votre classe TypesEnveloppe ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TypesEnveloppe
{
    
    public static void testClasseDouble(){
        System.out.println(Double.SIZE);
        Double x = Double.parseDouble("5.2");
        System.out.println(x + 1);
        System.out.println(x.toString() + 1);
        System.out.println(Double.valueOf("5.2").toString());
    }
    
    public static void testClasseInteger(){
        ////////////////////
        // Classe Integer //
        ////////////////////
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int number = Integer.parseInt("125");
        System.out.println(number + 5);
        Integer x = 5;
        int y = 10;
        System.out.println(x.doubleValue());
        System.out.println(x.toString() + 1);
        System.out.println(x + 1);
        Integer z = Integer.valueOf(y);
        z = y;
        System.out.println(z);
        int a = Integer.valueOf("25");
        Integer b = Integer.valueOf("25");
        System.out.println(a);
        System.out.println(b);
        System.out.println(z.toString() + 10);
        System.out.println(z.intValue() + 10);
    }

    public static void testClasseCharacter(){
        //////////////////////
        // Classe Character //
        //////////////////////
        
        System.out.println(Character.SIZE);
        System.out.println(Character.toString('A').length());
        Character letterA = 'A';
        System.out.println(letterA.toString().length());
        System.out.println(Character.valueOf('A').toString().length());
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isLowerCase('c'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('c'));
        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isLetter('+'));
        System.out.println(Character.isSpace(' '));
        System.out.println(Character.isSpace('5'));
        System.out.println(Character.isDigit('5'));
        String numberString = "125368";
        boolean isNumber = true;
        for(int i = 0; i < numberString.length(); i++){   
            char caractereCourant = numberString.charAt(i);
             isNumber = isNumber && Character.isDigit(caractereCourant);
             System.out.println(numberString.charAt(i) + " : " + isNumber);
             if(!isNumber){
                break;
             }
        }

        if(isNumber){
            int number = Integer.parseInt(numberString);
            System.out.println(number * 10);
        }

        // Utilisation d'un constructeur pour créer un objet x de type Character
        // Character x = new Character('A');
        // System.out.println(x);
    }
}
