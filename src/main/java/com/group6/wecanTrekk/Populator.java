package com.group6.wecanTrekk;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class Populator implements CommandLineRunner {

    @Resource
    private TrekkRepository trekkRepo;
    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private RegionRepository regionRepo;

    @Override
    public void run(String... args) throws Exception {
        Trekk africaR1 = new Trekk("Dahab","Egypt","Northern Africa","1","$400","img","Dahab is one of the most rewarding hiking trails in Egypt. " +
                "Considered a coastal hike, it will take you through the crystal blue waters and Sinai’s mountains, where you’ll be greeted by Bedouins every step of the way. Start your hike at the Blue Hole, a worldwide diving spot, stop for a while at Ras Abu Gallum Protectorate, where you can enjoy an authentic lunch and continue your path as you head towards your final stop, the Blue Lagoon, one of the best kitesurfing spots in Egypt. Learn some new kitesurfing skills while you’re there or just enjoy a swim in the lagoon and spend the night at one of the lagoon’s camps.");
        Trekk africaR2 = new Trekk("Mount Afadja","Ghana","Western Africa","4","$800","img","The highest mountain in West Africa offers spectacular views of both Ghana and Togo from its summit, which is accessed through a dense forest and a four-hour climb, passing three levels of waterfalls along the way. Many visitors hike Afajato and Tagbo falls.");
        Trekk asia1 = new Trekk("Kashmir Great Lakes Trek","Kashmir Valley","South Asia","6","$220","img","Kashmir Great Lakes is one the most beautiful treks in India. No question. It validates Kashmir's mythical status as heaven on earth. The range of landscape makes it a moderate-difficult trek spanning over six days. Climb up from Gadsar valley and you get transported to the early days of Windows XP wallpaper trekking through Valley of Satsar.");
        Trekk asia2 = new Trekk("Lhasa","China","Western China/Tibet","4","$1,099","img","Stunning overland journey through Tibet with a visit to the historic Everest Base Camp. Classic Tibetan journey - a rugged crossing of the Tibetan Plateau linking the fabled city of Lhasa with the bustling and vibrant Kathmandu. ");
        Trekk antarctica1 = new Trekk("Falkland Islands","Anatarctic","Northern Islands","5","$5,200","img","Falkland Island consist of many smaller island that make for a great adventures journey. Travelers don’t always expect white sandy beaches in sub-Antarctic islands. The numerous beaches of the Falkland Islands surprise many polar travelers—especially if they’re on a voyage that includes the Antarctic Peninsula ");
        Trekk antarctica2 = new Trekk("South Georgia","Anatarctic","Main Peninsula","5","$3,200","img","Located on the north shore of South Georgia Island, Fortuna Bay is marked by rugged mountainous terrain and abundant wildlife. It’s a relatively small bay – only 3 miles (5 km) long and 1 mile (1.6 km) wide and is ideal for observing icebergs");
        Trekk australia1 = new Trekk("Kiama Coast Walk","Australia","New South Wales","2","$100","img","Kiama Coast Walk is a 12.7 mile moderately trafficked point-to-point trail located near Kiama, New South Wales, Australia that offers the chance to see wildlife and is rated as moderate. The trail is primarily used for hiking, walking, running, and mountain biking and is accessible year-round.");
        Trekk australia2 = new Trekk("Keppel Lookout Trail","Australia","Victoria","2","Free","img","Climb up through stringybark and mountain ash forest to four of Marysville's best lookouts for spectacular views across Marysville, the Cathedral Range State Park and Steavenson Falls. Keppel Lookout Trail is fairly uneven and steep in places");
        Trekk europe1 = new Trekk("Bieszczady Mountains","Poland","Eastern Europe","7","$500","img","About a dozen trails wend through the 72,000-acre Bieszczady National Park, the highlight of this colorful, rolling range that boils up to about 4,500 feet in extreme southern Poland. Ambitious hikers with plenty of time can piece together routes up to ten-days long, following trails that drop into villages and climb over “polonyna” or the high mountain meadows that make this region so famous. ");
        Trekk europe2 = new Trekk("GR 20","France","Western Europe","7","400","img","If you are looking for a long, completely immersive hike, the GR 20 is your dream come true. It runs north to south down the middle of Corsica, and takes anywhere from eleven to fifteen days to complete. There are huts available at various points throughout the trail for overnight stays or shelter from bad weather");
        Trekk nAmerica = new Trekk("Across the Divide","Colorado","Rocky Mountains","8","$1,530","img","Across the Divide backpack takes us from the rivers that flow east into the Atlantic, to the very headwaters of those that make their way west to the Pacific – and we do it all under our own power! " +
                "We’ll begin along the waters of the pristine Big Thompson River, follow the drainage up past roaring waterfalls, alpine lakes, and glacial-carved granite cliffs. Then we’ll ascend above the clouds, over the Divide, and down into the river valleys flowing west out of the mountains!");
        Trekk nAmerica2 = new Trekk("Montagne des Érables","Quebec City","Canadian Shield","4","Free","img","With a 2,625-foot vertical drop, this difficult trail in the Charlevoix region’s Parc national des Hautes-Gorges-de-la-Rivière-Malbaie rewards with spectacular peak and valley views. " +
                "After a day of trekking through forest and alpine terrain on Quebec’s steepest trail, tuck into one of the park’s 10 new sleek Écho cabins, equipped with kitchen, bathroom, wood stove, and plenty of windows – so you can keep ogling those sheer mountain faces.")
        Trekk sAmerica = new Trekk("Mount Roraima","Venezuela","Gran Columbia","9","$500","img","Mount Roraima is a spectacular flat table mountain surrounded by sheer cliffs creating an island floating in the sky on the plains of the Gran Sabana (the Great Savannah), a large part of south eastern Venezuela. Hiking on Mount Roraima, surrounded by three different countries; Venezuela, Brazil and Guyana is one of the most unique places");
        Trekk sAmerica2 = new Trekk("Torres del Paine National Park","Chile","Gaucho","3","600","ccc","The W Circuit of Torres del Paine National Park is an easier feat than the full trail, but still demands long days of fairly strenuous hiking. Views of the “torres,” the unique granite mountain peaks in the park, are part of what make this such an attractive destination. This spectacular hike located in Chilean Patagonia attracts around 150,000 visitor each year.");


        trekkRepo.save(africaR1);
        trekkRepo.save(africaR2);
        trekkRepo.save(asia1);
        trekkRepo.save(asia2);
        trekkRepo.save(antarctica1);
        trekkRepo.save(antarctica2);
        trekkRepo.save(australia1);
        trekkRepo.save(australia2);
        trekkRepo.save(europe1);
        trekkRepo.save(europe2);
        trekkRepo.save(nAmerica);
        trekkRepo.save(nAmerica2);
        trekkRepo.save(sAmerica);
        trekkRepo.save(sAmerica2);



    }
}
