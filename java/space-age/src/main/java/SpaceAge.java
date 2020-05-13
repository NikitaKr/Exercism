class SpaceAge {


    
    double age;
    double sec;
    double orbitalPeriodOfEarthInDays = 365.25;

    SpaceAge(double seconds) {
        sec = seconds;
        age = seconds / 60 / 60 / 24;

    }

    double getSeconds() {
        return sec;
    }

    double onEarth() {
        return age / orbitalPeriodOfEarthInDays;
    }

    double onMercury() {
        return age / (orbitalPeriodOfEarthInDays * 0.2408467);
    }

    double onVenus() {
        return age / (orbitalPeriodOfEarthInDays * 0.61519726);
    }

    double onMars() {
        return age / (orbitalPeriodOfEarthInDays * 1.8808158);
    }

    double onJupiter() {
        return age / (orbitalPeriodOfEarthInDays * 11.862615);
    }

    double onSaturn() {
        return age / (orbitalPeriodOfEarthInDays * 29.447498);
    }

    double onUranus() {
        return age / (orbitalPeriodOfEarthInDays * 84.016846);
    }

    double onNeptune() {
        return age / (orbitalPeriodOfEarthInDays * 164.79132);
    }

}
