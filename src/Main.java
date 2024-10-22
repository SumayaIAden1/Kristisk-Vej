import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Aktivitet> tabel = new ArrayList<>();


        String semikolon = ";";
        String kvFile = "KritiskVej.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(kvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] kvReader = line.split(semikolon);
                //kommenterer den her sætning ud, så det ikke printer det hele to gange.
                // System.out.println("event: " + kvReader[0] + ", task: " + kvReader[1] + ", duration: " + kvReader[2]);
                // nu har vi separerede text filen i små index's

                int event = Integer.parseInt(kvReader[0]);
                String task = kvReader[1];
                int duration = Integer.parseInt(kvReader[2]);

                Aktivitet aktivitet = new Aktivitet(event, task, duration);

                tabel.add(aktivitet);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < tabel.size(); i++) {
            Aktivitet aktivitet = tabel.get(i);
            System.out.println(aktivitet);
        }

        int totalDuration = 0;
        for (int i = 0; i < tabel.size(); i++) {
            Aktivitet aktivitet = tabel.get(i);
            totalDuration += aktivitet.getDuration();
        }

        int antalAktivitet = tabel.size();

        double averageDuration = (double) totalDuration / antalAktivitet;

        System.out.println("Antal aktivitet: " + antalAktivitet);
        System.out.println("Gennemsnit: " + averageDuration + " dage");
    }
}