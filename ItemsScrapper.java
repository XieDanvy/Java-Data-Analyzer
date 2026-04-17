package fr.pantheonsorbonne.ufr27.miashs.poo;

import java.lang.String;
import java.util.ArrayList;

public final class ItemsScrapper {
  ArrayList<Item> parseSource(String pageSource) {
    ArrayList<Item> itemList = new ArrayList<>();
    while (true) {
      // add code here
      Item item = new Item();
      item.setNomDuJoueur(null);
      item.setTeamDuJoueur(null);
      item.setPosteDuJoueur(null);
      item.setPourcentage2Point(null);
      item.setPourcentage3Point(null);
      itemList.add(item);
      if(true) {
        // on a fini d'extraire les item
        break;
      }
    }
    return itemList;
  }
}
