package com.bijaysharma.funfacts;


import java.util.Random;

 class FactBook {

    String[] facts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "If you somehow found a way to extract all of the gold from the bubbling core of our lovely little planet, you would be able to cover all of the land in a layer of gold up to your knees.",

            "The average person spends 6 months of their lifetime waiting on a red light to turn green.",
            "The largest recorded snowflake was in Keogh, MT during year 1887, and was 15 inches wide.",
            "You burn more calories sleeping than you do watching television.",
            "There are more lifeforms living on your skin than there are people on the planet.",
            "If you believe that you’re truly one in a million, there are still approximately 7,184 more people out there just like you.",
            "There are more possible iterations of a game of chess than there are atoms in the known universe.",
            "Coca-Cola would be green if coloring wasn’t added to it.",
            "SILIGURI MODEL HIGH SCHOOL IS THE WORST SCHOOL OF THE WORLD.",
            "DUCK ! YOU PHYSICS AND CHEMISTRY !"
            };

        Random randomGenerator = new Random();

        String getFacts(){
        return facts[randomGenerator.nextInt(facts.length)];
    }
}
