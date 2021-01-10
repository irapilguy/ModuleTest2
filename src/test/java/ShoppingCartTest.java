import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    StringBuilder sb;

    @Test
    public void AppendFormattedTest1() {
        sb = new StringBuilder();
        ShoppingCart.appendFormatted(sb, "Title", 0, 14);
        assertEquals("    Title      ", sb.toString());
    }

    @Test
    public void AppendFormattedTest2() {
        sb = new StringBuilder();
        ShoppingCart.appendFormatted(sb, "Title", 0, 15);
        assertEquals("     Title      ", sb.toString());
    }

    @Test
    public void AppendFormattedTest3() {
        sb = new StringBuilder();
        ShoppingCart.appendFormatted(sb, "Title", 0, 5);
        assertEquals("Title ", sb.toString());
    }

    @Test
    public void AppendFormattedTest4() {
        sb = new StringBuilder();
        ShoppingCart.appendFormatted(sb, "Title", 1, 15);
        assertEquals("          Title ", sb.toString());
    }

    @Test
    public void AppendFormattedTest5() {
        sb = new StringBuilder();
        ShoppingCart.appendFormatted(sb, "Title", -1, 15);
        assertEquals("Title           ", sb.toString());
    }

    @Test
    public void DiscountTest1() {
        assertEquals(80, ItemFactory.createSaleItem("Title",1,500).calculateDiscount());
    }

    @Test
    public void DiscountTest2() {
        assertEquals(71, ItemFactory.createSaleItem("Title",1,10).calculateDiscount());
    }

    @Test
    public void DiscountTest3() {
        assertEquals(70, ItemFactory.createSaleItem("Title",1,9).calculateDiscount());
    }

    @Test
    public void DiscountTest4() {
        assertEquals(0,  ItemFactory.createNewItem("Title",1,20).calculateDiscount());
    }

    @Test
    public void DiscountTest5() {
        assertEquals(0,  ItemFactory.createNewItem("Title",1,10).calculateDiscount());
    }

    @Test
    public void DiscountTest6() {
        assertEquals(0,  ItemFactory.createNewItem("Title",1,1).calculateDiscount());
    }

    @Test
    public void DiscountTest7() {
        assertEquals(80, ItemFactory.createSecondFreeItem("Title",1,500).calculateDiscount());
    }

    @Test
    public void DiscountTest8() {
        assertEquals(53, ItemFactory.createSecondFreeItem("Title",1,30).calculateDiscount());
    }

    @Test
    public void DiscountTest9() {
        assertEquals(51, ItemFactory.createSecondFreeItem("Title",1,10).calculateDiscount());
    }

    @Test
    public void DiscountTest10() {
        assertEquals(50, ItemFactory.createSecondFreeItem("Title",1,9).calculateDiscount());
    }

    @Test
    public void DiscountTest11() {
        assertEquals(50, ItemFactory.createSecondFreeItem("Title",1,2).calculateDiscount());
    }

    @Test
    public void DiscountTest12() {
        assertEquals(0, ItemFactory.createSecondFreeItem("Title", 1, 1).calculateDiscount());
    }
}