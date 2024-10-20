class CaracteristiqueVisuel extends Program {
    void testVisualiserCaracteristique() {
        assertEquals("◼◼◼◼◼◼◼◼◼◼ Force", visualiserCaracteristique("Force", 10, 10));
        assertEquals("◼◼◼◻◻◻◻◻◻◻ Sagesse", visualiserCaracteristique("Sagesse", 3, 10));
        assertEquals("◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼ Agilité", visualiserCaracteristique("Agilité", 15, 15));
    }

    String visualiserCaracteristique(String nom, int valeur, int max) {
        String affichage="";
        for(int i=0; i<valeur; i=i+1) {
            affichage=affichage+"◼";
        }
        for(int i=0; i<max-valeur; i=i+1) {
            affichage=affichage+"◻";
        }

        return affichage+" "+nom;
    }
}