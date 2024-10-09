package associering;

import java.util.ArrayList;

public class Konto
{
   int kontonummer;
   int saldo;


    public int getKontonummer()
    {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer)
    {
        this.kontonummer = kontonummer;
    }

    public int getSaldo()
    {
        return saldo;
    }

    public void setSaldo(int saldo)
    {
        this.saldo = saldo;
    }

    public Konto()
   {
       this.kontonummer = kontonummer;
       this.saldo = saldo;
   }




}
