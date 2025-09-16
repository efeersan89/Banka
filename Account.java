package project6.Banka;

public class Account {

    // FIELDS
    private int accountId;
    private int customerId;
    private double balance;
    private AccountType accountType;

    // CONSTRUCTORS
    public Account(int accountId) {
    }

    public Account(int accountId, int customerId, AccountType accountType) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.accountType = accountType;
    }

    // GETTER AND SETTER METHODS
    // TODO GETTER VE SETTER METODLARINI OLUŞTURUN


    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    ////////////////////////////////////////////////////////////////////////////


    // TODO PARA EKLE (DEPOSIT) METODU
    //  YATIRILACAK TUTARIN SIFIRDAN BÜYÜK OLMASI GEREKİR.
    //  ŞART SAĞLANDIĞINDA İLGİLİ HESABIN BAKİYESİ ARTMIŞ OLMALIDIR.
    public void depositToAmount(double amount) {
    /*
      1. BU METODU BankSimulation SINIFINDAKİ depositToAccount() METODUNDA DİREKT ÇAĞIRARAK KULLANIN
      2. YATIRILMAK İSTENEN TUTAR, SIFIRDAN BÜYÜK MÜ DEĞİL Mİ KONTROL EDİN
      3. BÜYÜKSE BAKİYEYE İLAVE EDİP KULLANICIYA MESAJ VERİN
      4. YATIRILMAK İSTENEN TUTAR SIFIRDAN KÜÇÜKSE KULLANICIYA MESAJ VERİN, YENİDEN DENEMESİNİ İSTEYİN...
     */

        if (amount>0){
            balance += amount;
            System.out.println("Yatirilan tutar "+amount+ " TL");
            System.out.println("Guncel bakiye: "+ balance+" TL");
        }else {
            System.out.println("Gecersiz tutar. Tekrar deneyin.");
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////


    // TODO PARA ÇEK (WITHDRAW) METODU
    //  ÇEKİLECEK TUTARIN SIFIRDAN BÜYÜK OLMASI GEREKİR.
    //  ŞART SAĞLANDIĞINDA İLGİLİ HESABIN BAKİYESİ TUTAR KADAR AZALMIŞ OLMALIDIR.
    public void withdrawToAmount(double amount) {

        /*
         1. BU METODU BankSimulation SINIFINDAKİ withdrawToAccount() METODUNDA DİREKT ÇAĞIRARAK KULLANIN
         2. ÇEKİLMEK İSTENEN TUTAR, NEGATİF Mİ, DEĞİL Mİ KONTROL EDİN
         3. ÇEKİLMEK İSTENEN TUTAR BAKİYEDEN BÜYÜK MÜ, DEĞİL Mİ KONTROL EDİN
         4. ÇEKİLMEK İSTENEN TUTAR (amount) POZİTİFSE VE BAKİYEDEN KÜÇÜKSE,BAKİYEDEN DÜŞÜP,YENİ BAKİYEYİ KULLANICIYA BİLDİRİN...
         5. YATIRILMAK İSTENEN TUTAR SIFIRDAN KÜÇÜKSE YA DA BAKİYEDEN BÜYÜKSE,KULLANICIYA MESAJ VERİN, YENİDEN DENEMESİNİ İSTEYİN
         */

        if(amount >0 && amount <=balance){
            balance -= amount;
            System.out.println("Çekilen tutar: "+amount+" TL");
            System.out.println("Guncel bakiye: "+ balance+" TL");
        }else {
            System.out.println("Gecersiz tutar. Tekrar deneyin.");
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////

    // TODO TO STRING METODUNU OLUŞTURUN

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", customerId=" + customerId +
                ", balance=" + balance +
                ", accountType=" + accountType +
                '}';
    }

    ////////////////////////////////////////////////////////////////////////////////////////
}
