class genererBarre extends Program {
    void testGenererBarre(){
        assertEquals("◻◻◻◻◻◻◻◻◻◻", genererBarre(0, 10));
        assertEquals("◼◼◼◻◻◻◻◻◻◻", genererBarre(3, 10));
        assertEquals("◼◼◼◼◼◼◼◼◼◼", genererBarre(10, 10));
    }

    String genererBarre(int valeur, int max) {
        String barre="";
        for(int i=0; i<valeur; i=i+1) {
            barre=barre+"◼";
        }
        for(int i=0; i<max-valeur; i=i+1) {
            barre=barre+"◻";
        }
        return barre;
    }
}