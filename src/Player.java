import Weapon.*;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{
                new Pistol(),
                new MachineGun(),
                new BigGun(),
                new SlingShot(),
                new WaterPistol()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        final int  slotCount=getSlotsCount();
        if (slot > slotCount || slot < 1) {
            System.out.println("Некорректное значение! Попробуйте снова");
            System.out.println("номер слота с оружием начинается с 1 и заканчивается " + slotCount);
            return;
        }
        // Огонь!
        weaponSlots[slot-1].shot();
    }
}
