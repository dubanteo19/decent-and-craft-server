package com.nlu.DecentAndCraft.dataLoader;

import com.nlu.DecentAndCraft.model.Product;
import com.nlu.DecentAndCraft.model.status.ProductStatus;
import com.nlu.DecentAndCraft.repository.StatusRepository;
import com.nlu.DecentAndCraft.service.ProductService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(1)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductLoader implements CommandLineRunner {
    ProductService productService;
    StatusRepository statusRepository;

    @Override
    public void run(String... args) throws Exception {
        // s3 la trang thai con hang
        var s3 = ProductStatus.CON_HANG;
        Product p1 = new Product(null, "Giấy điệp truyền thống Việt Nam nhiều màu, giấy tự nhiên", "https://chothucong.vn/images/products/2022/12/21/original/228.JPG", 60000, 60000, s3, 100);
        Product p2 = new Product(null, "Ốc sên gốm tráng men - Tượng gốm xinh xắn trang trí, decor sân vườn", "https://chothucong.vn/images/products/2022/12/26/original/277.JPG", 80000, 80000, s3, 200);
        Product p3 = new Product(null, "Ốc sên gốm tráng men - Tượng gốm xinh xắn trang trí, decor sân vườn", "https://chothucong.vn/images/products/2022/12/26/original/277.JPG", 80000, 80000, s3, 50);
        Product p4 = new Product(null, "Ốc sên gốm tráng men - Tượng gốm xinh xắn trang trí, decor sân vườn", "https://chothucong.vn/images/products/2022/12/26/original/277.JPG", 80000, 80000, s3, 100);
        Product p5 = new Product(null, "Ốc sên gốm tráng men - Tượng gốm xinh xắn trang trí, decor sân vườn", "https://chothucong.vn/images/products/2022/12/26/original/277.JPG", 80000, 80000, s3, 100);
        productService.saveAll(List.of(p1, p2, p3, p4, p5));
    }

}
