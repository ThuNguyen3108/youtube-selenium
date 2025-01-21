package buoi5_OOP;

// tinh chat dong goi la  muốn giới hạn sự cho phép để mấy thằng khác dùng lại nó
public class TinhDongGoi {
    private String name;
//    public setText(WebElement element, String value)
//    {
    // element là vị trí mà mình muốn tìm
    // value là giá trị mà mình truyền vào
//        element.findElement(Byte.ID("table"));
//        element.sendKeys();
//    }

//    public TinhDongGoi() {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        TinhDongGoi tinh_DongGoi = new TinhDongGoi();
        tinh_DongGoi.setName("Auto");
        System.out.println(tinh_DongGoi.getName());

        tinh_DongGoi.setName("Auto Test");
        System.out.println(tinh_DongGoi.getName());

    }
}
