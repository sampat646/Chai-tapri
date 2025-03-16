# ☕ Chai Stall Manager: Ekdum Desi Tapri! 🇮🇳
## Ye Kya Hai, Bhai?
Oye, ye **Chai Stall Manager** hai—Java ka chhota sa project jo chai banata, paisa mangta, aur customer ko chillata hai! **Dependency Injection** (DI) ka jadoo—constructor, setter, method injection—sab ekdum flexible bana deta hai. Tapri pe sutta nahi miltha idhar, bas garam chai aur masti!

### Mast Features
- **Chai Time**: Masala ya Cutting, banake dega! 🍵
- **Paisa Do**: Cash ya UPI, jo marzi set kar! 💵
- **Chilla Do**: Loud ya soft, customer ko bula! 📢

## Kaise Bana Hai?
- **Package**: `org.interFace.chai`
- **Interfaces**: `IChaiMaker` (chai banao), `IPaisaTaker` (paisa lo), `ICaller` (chilla do).
- **Kaam Wale**: `SimpleChaiMaker`, `FancyChaiMaker`, `CashPaisa`, `UPIPaisa`, `LoudCaller`, `SoftCaller`.
- **Boss**: `ChaiStall` (DI ka king!).
- **Demo**: `Main` (dekho kaise chalta!).

### DI Ka Khel
- **Constructor**: `IChaiMaker`—chai ke bina stall nahi!
- **Setter**: `IPaisaTaker`—paisa ka tareeka badlo!
- **Method**: `ICaller`—ek order, ek chilla!

## Chalu Karo, Bhai!
1. **Le Aao**: 
   ```
   git clone https://github.com/YOUR-USERNAME/chai-stall-manager.git
   cd chai-stall-manager
   ```
2. **Kholo**: IDE mein daal do—IntelliJ ya Eclipse!
3. **Chalao**:
   - `javac org/interFace/chai/*.java org/interFace/chai/service/*.java org/interFace/chai/interFaces/*.java`
   - `java org.interFace.chai.Main`

## Output Kaisa Lagega?
```
Chai Stall khul gaya with SimpleChaiMaker, bhai!
Paisa Taker set: CashPaisa
Masala chai ban gaya!
Cash me 10 rupaye liye!
Oye Rahul tera Masala ready hai le aaja
Paisa Taker set: UPIPaisa
Cutting chai ban gaya!
UPI paisa me 10 rupaye liye!
Hey Shyam ji apka Cutting ready hai!
```

## Khelne Ka Tareeka
- Stall shuru karo, chai maker do.
- Paisa taker set karo—cash ya UPI.
- Chai serve karo—customer ko bulao!

## Thoda Aur Karo
- `AdrakChai` add karo!
- `PhonePePaisa` daal do!
- Orders save karne database laga do!

## Kyun Banaya?
- DI seekha—constructor, setter, method! 🎯
- Tapri wala feel—sutta nahi miltha idhar, chai hi chai! 😜

## Help Karo
Fork karo, pull request maaro, ya issue bol do—sab saath mein maza lenge!

## License
Free hai, bhai—padho, banao, piyo!

## Tapri Ka Malik
- **YOUR NAME**: [sampat646](https://github.com/sampat646) — chai ka asli guru!
