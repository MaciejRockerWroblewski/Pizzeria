package JavaStart.pełenBrzuszek;

public enum Pizza {

    MARGHERITA(true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    BAMBOLA(true, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    CAPRICIOSA(true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    PEPEROSO(true, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    BEDNARE(true, true, false, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    DECORO(true, true, true, true, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    NEAPOLITANA(true, true, false, false, false, false, true, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    PIACARE(true, true, false, false, false, true, true, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    FARMERSKA(true, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false),
    DORMIRE(true, true, false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false),
    MAFIOSO(true, true, false, false, false, false, true, false, false, true, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    PEPPERONI(true, true, false, true, true, false, true, false, false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    CARATO(true, true, true, false, false, true, false, true, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    PELEN_BRZUSZEK(true, true, false, true, false, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false),
    CALZONE_PIERÓG(true, true, true, true, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    FETINA(true, true, false, true, false, false, false, false, false, false, false, true, false, false, false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    ALBA_BELA(true, true, false, false, true, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    ARISTO(true, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    WIOSENNA(true, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    KEBAB(true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    SPINACCHI(true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    ROSONE(true, true, true, false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    CZTERY_SERY(true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true),
    TRICOLORE(true, true, false, false, true, true, false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    ALTERO(true, true, true, false, true, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    CORSO(true, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    NERASTO(true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    TONINO(true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false),
    FRANCESKA(true, true, true, false, false, true, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false),
    GUDFADERN(true, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false),
    FRUTI_DI_MARE(true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false),
    HAWAII(true, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false),
    KURCZAK_HAWAII(true, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, true, false, false, false, false, false, false, false, false),
    SAN_FRANCISCO(true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, true, false, false, false, false, false, false, false),
    GYROS_NAS_SLODKO(true, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false),
    GÓRALSKA(true, true, false, true, false, false, false, true, false, false, false, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false),
    KURCZAK(true, true, true, false, true, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    GYROS(true, true, true, false, true, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false),
    GYROS_NA_OSTRO(true, true, false, false, false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false),
    SAPORITA(true, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false),
    ROMA(true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false),
    ITALIANA(true, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false),
    RUKOLITA(true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, true, false),
    PESTO(true, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false),
    VITO(true, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false, false),
    NORWESKA(true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false);


    private final boolean tomatoSauce;
    private final boolean cheese;
    private final boolean mushrooms;
    private final boolean ham;
    private final boolean papryka;
    private final boolean onion;
    private final boolean salami;
    private final boolean bacon;
    private final boolean olives;
    private final boolean garlic;
    private final boolean jalapeno;
    private final boolean corn;
    private final boolean sausage;
    private final boolean tabasco;
    private final boolean chilli;
    private final boolean spinach;
    private final boolean kebab;
    private final boolean mouldedCheese;
    private final boolean mozarella;
    private final boolean saladCheese;
    private final boolean tomato;
    private final boolean broccoli;
    private final boolean pickles;
    private final boolean roastedOnion;
    private final boolean courgette;
    private final boolean chive;
    private final boolean tuna;
    private final boolean anchois;
    private final boolean asparagus;
    private final boolean clams;
    private final boolean shrimps;
    private final boolean pineapple;
    private final boolean fruttiDiMare;
    private final boolean kiwi;
    private final boolean chicken;
    private final boolean banana;
    private final boolean redBean;
    private final boolean redOnion;
    private final boolean rucola;
    private final boolean driedTomatoes;
    private final boolean lemon;
    private final boolean kabanos;
    private final boolean cheddarCheese;

    Pizza(boolean tomatoSauce, boolean cheese, boolean mushrooms, boolean ham, boolean papryka, boolean onion, boolean salami, boolean bacon, boolean olives, boolean garlic, boolean jalapeno, boolean corn, boolean sausage, boolean tabasco, boolean chilli, boolean spinach, boolean kebab, boolean mouldedCheese, boolean mozarella, boolean saladCheese, boolean tomato, boolean broccoli, boolean pickles, boolean roastedOnion, boolean courgette, boolean chive, boolean tuna, boolean anchois, boolean asparagus, boolean clams, boolean shrimps, boolean pineapple, boolean fruttiDiMare, boolean kiwi, boolean chicken, boolean banana, boolean redBean, boolean redOnion, boolean rucola, boolean driedTomatoes, boolean lemon, boolean kabanos, boolean cheddarCheese) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.ham = ham;
        this.papryka = papryka;
        this.onion = onion;
        this.salami = salami;
        this.bacon = bacon;
        this.olives = olives;
        this.garlic = garlic;
        this.jalapeno = jalapeno;
        this.corn = corn;
        this.sausage = sausage;
        this.tabasco = tabasco;
        this.chilli = chilli;
        this.spinach = spinach;
        this.kebab = kebab;
        this.mouldedCheese = mouldedCheese;
        this.mozarella = mozarella;
        this.saladCheese = saladCheese;
        this.tomato = tomato;
        this.broccoli = broccoli;
        this.pickles = pickles;
        this.roastedOnion = roastedOnion;
        this.courgette = courgette;
        this.chive = chive;
        this.tuna = tuna;
        this.anchois = anchois;
        this.asparagus = asparagus;
        this.clams = clams;
        this.shrimps = shrimps;
        this.pineapple = pineapple;
        this.fruttiDiMare = fruttiDiMare;
        this.kiwi = kiwi;
        this.chicken = chicken;
        this.banana = banana;
        this.redBean = redBean;
        this.redOnion = redOnion;
        this.rucola = rucola;
        this.driedTomatoes = driedTomatoes;
        this.lemon = lemon;
        this.kabanos = kabanos;
        this.cheddarCheese = cheddarCheese;
    }

    @Override
    public String toString() {

        String result = name() + " (";
        if (tomatoSauce) {
            result += "sos pomidorowy";
        }
        if (cheese) {
            result += ", ser";
        }
        if (mushrooms) {
            result += ", pieczarki";
        }
        if (ham) {
            result += ", szynka";
        }
        if (papryka) {
            result += ", papryka";
        }
        if (onion) {
            result += ", cebula";
        }
        if (salami) {
            result += ", salami";
        }
        if (bacon) {
            result += ", boczek";
        }
        if (olives) {
            result += ", oliwki";
        }
        if (garlic) {
            result += ", czosnek";
        }
        if (jalapeno) {
            result += ", jalapeno";
        }
        if (corn) {
            result += ", kukurydza";
        }
        if (sausage) {
            result += ", kiełbasa";
        }
        if (tabasco) {
            result += ", sos tabasco";
        }
        if (spinach) {
            result += ", szpinak";
        }
        if (kebab) {
            result += ", kebab";
        }
        if (mouldedCheese) {
            result += ", ser pleśniowy";
        }
        if (mozarella) {
            result += ", mozarella";
        }
        if (saladCheese) {
            result += ", ser sałatkowy";
        }
        if (tomato) {
            result += ", pomidory";
        }
        if (broccoli) {
            result += ", brokuły";
        }
        if (pickles) {
            result += ", ogórki konserwowe";
        }
        if (roastedOnion) {
            result += ", prażona cebulka";
        }
        if (courgette) {
            result += ", bakłażan";
        }
        if (chive) {
            result += ", szczypiorek";
        }
        if (tuna) {
            result += ", tuńczyk";
        }
        if (anchois) {
            result += ", anchois";
        }
        if (asparagus) {
            result += ", szparagi";
        }
        if (clams) {
            result += ", małże";
        }
        if (shrimps) {
            result += ", krewetki";
        }
        if (pineapple) {
            result += ", ananas";
        }
        if (fruttiDiMare) {
            result += ", owoce morza (mix)";
        }
        if (kiwi) {
            result += ", kiwi";
        }
        if (chicken) {
            result += ", kurczak";
        }
        if (banana) {
            result += ", banan";
        }
        if (redBean) {
            result += ", czerwona fasola";
        }
        if (redOnion) {
            result += ", czerwona cebula";
        }
        if (rucola) {
            result += ", rukola";
        }
        if (driedTomatoes) {
            result += ", suszone pomidory";
        }
        if (lemon) {
            result += ", cytryna";
        }
        if (kabanos) {
            result += ", kabanos";
        }
        if (cheddarCheese) {
            result += ", ser cheddar";
        }
        result += ")";
        return result;
    }
}






