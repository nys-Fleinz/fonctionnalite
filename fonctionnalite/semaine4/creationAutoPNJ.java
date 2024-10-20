class creationAutoPNJ extends Program {
    void algorithm() {
        String champ1="Frodon,Force,4,Agilité,9,Sagesse,9";
        String champ2="Z6PO,Force,1,Agilité,1,Langues,10";
        String champ3="Beetlejuice,Magie,6,Malice,10,Sarcasme,10";
        afficherStats(champ1);
        afficherStats(champ2);
        afficherStats(champ3);

    }

    void afficherStats(String champ) {
        String[] tableau = getChamp(champ);
        String affichage = tableau[0]+"\n";
        affichage=affichage+creerBarre(tableau[2])+" "+tableau[1]+"\n";
        affichage=affichage+creerBarre(tableau[4])+" "+tableau[3]+"\n";
        affichage=affichage+creerBarre(tableau[6])+" "+tableau[5];
        println(affichage);
    }

    String[] getChamp(String data) {
        String[] tableau = new String[7];
        int compteur=0;
        int derniereVirgule=0;
        for(int i=0; i<length(data); i=i+1) {
            if(compteur>=6) {
                tableau[compteur]=substring(data, derniereVirgule, length(data));
            } else if(charAt(data, i)==',') {
                tableau[compteur]=substring(data, derniereVirgule, i);
                compteur=compteur+1;
                derniereVirgule=i+1;
            }
        }
        return tableau;
    }

    String creerBarre(String StringStat) {
        String barre="";
        int IntStat = stringToInt(StringStat);
        for(int i=0; i<IntStat; i=i+1) {
            barre=barre+"◼";
        }
        for(int i=0; i<10-IntStat; i=i+1) {
            barre=barre+"◻";
        }
        return barre;
    }

}