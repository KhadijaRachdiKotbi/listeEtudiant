public class Main {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant(1, "Dupont", "Jean");
        Etudiant etudiant2 = new Etudiant(2, "Martin", "Pierre");
        Etudiant etudiant3 = new Etudiant(3, "Martine", "PCarmen");

        System.out.println(etudiant1);
        System.out.println(etudiant2);
        System.out.println(etudiant3);

        System.out.println(etudiant1.equals(etudiant2));

        etudiant1.setId(2);
        etudiant1.setNom("Martin");
        etudiant1.setPrenom("Pierre");

        System.out.println(etudiant1);
        System.out.println(etudiant2);

        System.out.println(etudiant1.equals(etudiant2));
        System.out.println(etudiant2.equals(etudiant3));
    }
}