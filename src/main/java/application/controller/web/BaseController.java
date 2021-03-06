package application.controller.web;

import application.viewmodel.common.LayoutHeaderVM;
import application.viewmodel.common.LogoVM;
import application.viewmodel.landing.MenuItemVM;

import java.util.ArrayList;

public abstract class BaseController {
    public void setLayoutHeaderVM(LayoutHeaderVM vm) {
        LogoVM logo = new LogoVM("SportOnline",
                "/img/sportshop.png","SportOnline","SportOnline");
        ArrayList<MenuItemVM> listHrMenuItems = new ArrayList<>();
        listHrMenuItems.add(new MenuItemVM("Trang chủ" ,"/"));
        listHrMenuItems.add(new MenuItemVM("Máy chạy bộ" ,"/"));
        listHrMenuItems.add(new MenuItemVM("Xe đạp tập thể dục" ,"/"));
        listHrMenuItems.add(new MenuItemVM("Dụng cụ thể hình" ,"/"));
        listHrMenuItems.add(new MenuItemVM("Dụng cụ Yoga-Thẩm mỹ" ,"/"));
        listHrMenuItems.add(new MenuItemVM("Dụng cụ bơi lội" ,"/"));
        listHrMenuItems.add(new MenuItemVM("Giày thể thao" ,"/"));

        listHrMenuItems.get(1).getChildren().add(new MenuItemVM("Máy chạy bộ điện","/"));

        listHrMenuItems.get(2).getChildren().add(new MenuItemVM("Xe đạp tập thể lục", "/"));
        listHrMenuItems.get(2).getChildren().add(new MenuItemVM("   Xe đạp tập toàn thân", "/"));
        listHrMenuItems.get(2).getChildren().add(new MenuItemVM("Xe đạp tập phục hồi chức năng", "/"));

        listHrMenuItems.get(3).getChildren().add(new MenuItemVM("Giàn tập tạ", "/"));
        listHrMenuItems.get(3).getChildren().add(new MenuItemVM("Máy tập phòng gym", "/"));
        listHrMenuItems.get(3).getChildren().add(new MenuItemVM("Máy tập cơ bụng", "/"));
        listHrMenuItems.get(3).getChildren().add(new MenuItemVM("Xà đơn - Xà kép", "/"));
        listHrMenuItems.get(3).getChildren().add(new MenuItemVM("Phụ kiện tập thể hình", "/"));

        listHrMenuItems.get(4).getChildren().add(new MenuItemVM("Thảm tập Yoga", "/"));
        listHrMenuItems.get(4).getChildren().add(new MenuItemVM("Bóng tập Yoga", "/"));
        listHrMenuItems.get(4).getChildren().add(new MenuItemVM("Dụng cụ tập thẩm mỹ", "/"));
        listHrMenuItems.get(4).getChildren().add(new MenuItemVM("Rebook-Adidas chính hãng", "/"));

        listHrMenuItems.get(5).getChildren().add(new MenuItemVM("Kính bơi", "/"));
        listHrMenuItems.get(5).getChildren().add(new MenuItemVM("Mũ bơi", "/"));
        listHrMenuItems.get(5).getChildren().add(new MenuItemVM("Phao bơi", "/"));
        listHrMenuItems.get(5).getChildren().add(new MenuItemVM("Quần bơi", "/"));

        listHrMenuItems.get(6).getChildren().add(new MenuItemVM("Giày chạy bộ", "/"));
        listHrMenuItems.get(6).getChildren().add(new MenuItemVM("Giày cầu lông", "/"));
        listHrMenuItems.get(6).getChildren().add(new MenuItemVM("Giày tennis", "/"));

        vm.setLogo(logo);
        vm.setListHrMenuItems(listHrMenuItems);
    }
}
