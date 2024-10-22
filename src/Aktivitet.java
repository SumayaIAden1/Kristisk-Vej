import java.util.ArrayList;

public class Aktivitet
{

    public Aktivitet()
    { }

    private int     event;
    private String  task;
    private int     duration;
    private ArrayList<Aktivitet> tabel = new ArrayList<>();
    private int     antalAktivitet = 0;


            public Aktivitet(int e, String t, int d) {
                event = e;
                task = t;
                duration = d;
            }

            public int getEvent()
            {
                return event;
            }

            public String getTask()
            {
                return task;
            }

            public int getDuration()
            {
                return duration;
            }

            public String toString()
            {
                return "event; " + event + " task; " + task + " duration; " + duration;
            }

    public static void sorterEvent(ArrayList<Aktivitet> list)
    {
        for (int i = 0; i < tabel.size(); i++)
        {
            for (int j = 0; j < tabel.size() - 1; j++)
            {
                if (tabel.get(j).getEvent().compareTo(tabel.get(j + 1).getEvent()) < 0)
                {
                    swap(j, j + 1);
                }
            }
        }
    }

    private void swap (ArrayList<Aktivitet>Tabel, int x, int y)
    {
        Aktivitet = tabel.get(x);
        tabel.set(x, tabel.get(y));
        tabel.set(y, temp);
    }
}

