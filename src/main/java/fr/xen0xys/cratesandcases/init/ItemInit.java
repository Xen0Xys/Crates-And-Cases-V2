package fr.xen0xys.cratesandcases.init;

import fr.xen0xys.cratesandcases.objects.items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static List<Item> ITEMS = new ArrayList<>();

    // Items:
    public static final Item TEST_ITEM = new ItemBase("test_item");
}
