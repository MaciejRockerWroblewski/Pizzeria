package JavaStart.pętle_szpital;

public class Hospital {

    private final int maxPatientsNumber = 10;
    Patient [] patients = new Patient[maxPatientsNumber];
    private int registeredPatients = 0;

    public void addPatient(Patient patient){

        if (registeredPatients < maxPatientsNumber){
            patients [registeredPatients] = patient;
            registeredPatients++;
        }else{
            System.out.println("Brak wolnych terminów. Zapraszamy jutro.");
        }
    }

    public void printPatients(){
        for (int i = 0; i < registeredPatients; i++) {
            System.out.println(patients[i].getName()
                    + " " + patients[i].getLastName()
                    + " " + patients[i].getPesel());

        }

    }



}
