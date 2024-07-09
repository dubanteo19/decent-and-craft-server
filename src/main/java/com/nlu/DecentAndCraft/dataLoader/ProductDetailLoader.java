package com.nlu.DecentAndCraft.dataLoader;

import com.nlu.DecentAndCraft.dto.request.CategoryAddRequest;
import com.nlu.DecentAndCraft.model.Image;
import com.nlu.DecentAndCraft.model.Product;
import com.nlu.DecentAndCraft.model.ProductBlog;
import com.nlu.DecentAndCraft.model.ProductDetail;
import com.nlu.DecentAndCraft.service.CategoryService;
import com.nlu.DecentAndCraft.service.ProductDetailService;
import com.nlu.DecentAndCraft.service.ProductService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(2)
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PACKAGE)
public class ProductDetailLoader implements CommandLineRunner {
    ProductDetailService productDetailService;
    ProductService productService;
    CategoryService categoryService;

    @Override
    public void run(String... args) {
        loadCategories();
        var c1 = categoryService.getCategoryById(1L);
        var c2 = categoryService.getCategoryById(2L);
        var c3 = categoryService.getCategoryById(3L);
        var c4 = categoryService.getCategoryById(4L);
        var c5 = categoryService.getCategoryById(5L);
        var c6 = categoryService.getCategoryById(6L);

        // Product detail 1
        ProductDetail productDetail1 = new ProductDetail();
        var product1 = productService.findById(1L);
        var savedProductDetail1 = productDetailService.save(productDetail1);
        var productBlog1 = new ProductBlog(0L, "Nến Tealight toả hương thơm ngay cả khi chưa đốt.");
        Image pd1Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lw2e7o8awsez71",
                savedProductDetail1);
        Image pd1Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lw2e7o8ay6zf50",
                savedProductDetail1);
        Image pd1Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lkgbayw1im58a5",
                savedProductDetail1);
        Image pd1Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lmpoqaomm0gv88",
                savedProductDetail1);
        Image pd1Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lmpoqaomnf1b66",
                savedProductDetail1);
        var images1 = List.of(pd1Img1, pd1Img2, pd1Img3, pd1Img4, pd1Img5);
        savedProductDetail1.setImageList(images1);
        savedProductDetail1.setProductBlog(productBlog1);
        savedProductDetail1.setProduct(product1);
        savedProductDetail1.setCategoryList(List.of(c1, c4));
        productDetailService.save(savedProductDetail1);

        // Product detail 2
        ProductDetail productDetail2 = new ProductDetail();
        var product2 = productService.findById(2L);
        var savedProductDetail2 = productDetailService.save(productDetail2);
        var productBlog2 = new ProductBlog(0L,
                "Bao gồm Hộp đựng quà, 01 Nến thơm 120gr, Bó hoa mini, Phụ kiện decor như hình");
        Image pd2Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lw2e7o8awsez71",
                savedProductDetail2);
        Image pd2Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lw2e7o8ay6zf50",
                savedProductDetail2);
        Image pd2Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lkgbayw1im58a5",
                savedProductDetail2);
        Image pd2Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lmpoqaomm0gv88",
                savedProductDetail2);
        Image pd2Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lmpoqaomnf1b66",
                savedProductDetail2);
        var images2 = List.of(pd2Img1, pd2Img2, pd2Img3, pd2Img4, pd2Img5);
        savedProductDetail2.setImageList(images2);
        savedProductDetail2.setProductBlog(productBlog2);
        savedProductDetail2.setProduct(product2);
        savedProductDetail2.setCategoryList(List.of(c1, c4));
        productDetailService.save(savedProductDetail2);

        // Product detail 3
        ProductDetail productDetail3 = new ProductDetail();
        var product3 = productService.findById(3L);
        var savedProductDetail3 = productDetailService.save(productDetail3);
        var productBlog3 = new ProductBlog(0L,
                "BẠN LƯU Ý, NẾN THƠM MINI CHỈ CÓ TÁC DỤNG KHI ĐỐT TRONG KHÔNG GIAN NHỎ, ĐỐT TẦM 30P NẾN MỚI TOẢ HƯƠNG TỪ TỪ VÀ LƯU HƯƠNG LẠI TRONG VÀI TIẾNG SAU");
        Image pd3Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lw2e7o8awsez71",
                savedProductDetail3);
        Image pd3Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lw2e7o8ay6zf50",
                savedProductDetail3);
        Image pd3Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lkgbayw1im58a5",
                savedProductDetail3);
        Image pd3Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lmpoqaomm0gv88",
                savedProductDetail3);
        Image pd3Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lmpoqaomnf1b66",
                savedProductDetail3);
        var images3 = List.of(pd3Img1, pd3Img2, pd3Img3, pd3Img4, pd3Img5);
        savedProductDetail3.setImageList(images3);
        savedProductDetail3.setProductBlog(productBlog3);
        savedProductDetail3.setProduct(product3);
        savedProductDetail3.setCategoryList(List.of(c1, c4));
        productDetailService.save(savedProductDetail3);

        // Product detail 4
        ProductDetail productDetail4 = new ProductDetail();
        var product4 = productService.findById(4L);
        var savedProductDetail4 = productDetailService.save(productDetail4);
        var productBlog4 = new ProductBlog(0L,
                "Set quà tặng cao cấp bao gồm: 1 bó hoa baby mix hoa sáp + túi xách + thiệp + đèn led sang xịn. Màu hoa khách chọn tuỳ ý");
        Image pd4Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-ljc8q09in2s213",
                savedProductDetail4);
        Image pd4Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-ljc8q09ipvwybc",
                savedProductDetail4);
        Image pd4Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lnec8xf7cjxp94",
                savedProductDetail4);
        Image pd4Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lnec8xf78c8dd7",
                savedProductDetail4);
        Image pd4Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lnec8xf7dyi5eb",
                savedProductDetail4);
        var images4 = List.of(pd4Img1, pd4Img2, pd4Img3, pd4Img4, pd4Img5);
        savedProductDetail4.setImageList(images4);
        savedProductDetail4.setProductBlog(productBlog4);
        savedProductDetail4.setProduct(product4);
        savedProductDetail4.setCategoryList(List.of(c1, c4, c5));
        productDetailService.save(savedProductDetail4);

        // Product detail 5
        ProductDetail productDetail5 = new ProductDetail();
        var product5 = productService.findById(5L);
        var savedProductDetail5 = productDetailService.save(productDetail5);
        var productBlog5 = new ProductBlog(0L,
                "Do tỉ lệ pha màu để có nhiều màu khác nhau nên độ dày mỏng giấy bị ảnh hưởng, trong 1 tập giấy có thể có màu dày hoặc mỏng hơn các màu khác.");
        Image pd5Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lri3zb6fh9dw4a",
                savedProductDetail5);
        Image pd5Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lju27ls1ptis66",
                savedProductDetail5);
        Image pd5Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lju27ltgy56cfa",
                savedProductDetail5);
        Image pd5Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-leq0pd1m22lvb9",
                savedProductDetail5);
        Image pd5Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-liazi5wgey1efe",
                savedProductDetail5);
        var images5 = List.of(pd5Img1, pd5Img2, pd5Img3, pd5Img4, pd5Img5);
        savedProductDetail5.setImageList(images5);
        savedProductDetail5.setProductBlog(productBlog5);
        savedProductDetail5.setProduct(product5);
        savedProductDetail5.setCategoryList(List.of(c1, c4, c6));
        productDetailService.save(savedProductDetail5);

        // Product detail 6
        ProductDetail productDetail6 = new ProductDetail();
        var product6 = productService.findById(6L);
        var savedProductDetail6 = productDetailService.save(productDetail6);
        var productBlog6 = new ProductBlog(0L,
                "Set Quà cao cấp Tặng Mẹ Tặng Bạn Gái Quà Tặng Dịp Lễ Tết Sinh Nhật Valentine 8/3 20/10 20/11 LT01");
        Image pd6Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rbni-lnnsfskjnirs67",
                savedProductDetail6);
        Image pd6Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rbn4-lnnsft170kaw16",
                savedProductDetail6);
        Image pd6Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rbli-lnnsftjs9dba11",
                savedProductDetail6);
        Image pd6Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rbmv-lnnsftz1lmdo30",
                savedProductDetail6);
        Image pd6Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rbla-lnnsfuf4y2h1c7",
                savedProductDetail6);
        var images6 = List.of(pd6Img1, pd6Img2, pd6Img3, pd6Img4, pd6Img5);
        savedProductDetail6.setImageList(images6);
        savedProductDetail6.setProductBlog(productBlog6);
        savedProductDetail6.setProduct(product6);
        savedProductDetail6.setCategoryList(List.of(c1, c4));
        productDetailService.save(savedProductDetail6);

        // Product detail 7
        ProductDetail productDetail7 = new ProductDetail();
        var product7 = productService.findById(7L);
        var savedProductDetail7 = productDetailService.save(productDetail7);
        var productBlog7 = new ProductBlog(0L, "Hộp giấy decor siêu xinh bởi Staff Caste khéo tay.");
        Image pd7Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/d31d3b201354bb4978959413891bc04c",
                savedProductDetail7);
        Image pd7Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/21ec3863f4b054ffb348e023cee29f6b",
                savedProductDetail7);
        Image pd7Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lk5jtoikh2bm44",
                savedProductDetail7);
        Image pd7Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lk5jtoikfnr606",
                savedProductDetail7);
        Image pd7Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/27cb55c95a343ce67c1a99df3446a4fc",
                savedProductDetail7);
        var images7 = List.of(pd7Img1, pd7Img2, pd7Img3, pd7Img4, pd7Img5);
        savedProductDetail7.setImageList(images7);
        savedProductDetail7.setProductBlog(productBlog7);
        savedProductDetail7.setProduct(product7);
        savedProductDetail7.setCategoryList(List.of(c1, c4));
        productDetailService.save(savedProductDetail7);

        // Product detail 8
        ProductDetail productDetail8 = new ProductDetail();
        var product8 = productService.findById(8L);
        var savedProductDetail8 = productDetailService.save(productDetail8);
        var productBlog8 = new ProductBlog(0L,
                "❣Quà tặng nến thơm và cốc xinh xắn, quà lưu niệm ý nghĩa, độc đáo QT28");
        Image pd8Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lgd7at3k4hrrc1",
                savedProductDetail8);
        Image pd8Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lgd7at3kebqv42",
                savedProductDetail8);
        Image pd8Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lm4h1jknmw2nf9",
                savedProductDetail8);
        Image pd8Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lgd7at3k1obu70",
                savedProductDetail8);
        Image pd8Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lgd7at6vwt87f0",
                savedProductDetail8);
        var images8 = List.of(pd8Img1, pd8Img2, pd8Img3, pd8Img4, pd8Img5);
        savedProductDetail8.setImageList(images8);
        savedProductDetail8.setProductBlog(productBlog8);
        savedProductDetail8.setProduct(product8);
        savedProductDetail8.setCategoryList(List.of(c1, c4, c5));
        productDetailService.save(savedProductDetail8);

        // Product detail 9
        ProductDetail productDetail9 = new ProductDetail();
        var product9 = productService.findById(9L);
        var savedProductDetail9 = productDetailService.save(productDetail9);
        var productBlog9 = new ProductBlog(0L,
                "Túi tự đan handmade, túi đan len ý nghĩa ,làm quà tặng người thân, bạn gái đầy đủ nguyên liệu BAGGU DIY, kèm video hướng dẫn chi tiết A01");
        Image pd9Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ltvx7hl7ljii04",
                savedProductDetail9);
        Image pd9Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ltvx7hl7r5sac4",
                savedProductDetail9);
        Image pd9Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ltvx7hl7k4y2c3",
                savedProductDetail9);
        Image pd9Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ltvx7hl7iqdmd8",
                savedProductDetail9);
        Image pd9Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ltvx7hl7hbt6c6",
                savedProductDetail9);
        var images9 = List.of(pd9Img1, pd9Img2, pd9Img3, pd9Img4, pd9Img5);
        savedProductDetail9.setImageList(images9);
        savedProductDetail9.setProductBlog(productBlog9);
        savedProductDetail9.setProduct(product9);
        savedProductDetail9.setCategoryList(List.of(c1, c4, c6));
        productDetailService.save(savedProductDetail9);

        // Product detail 10
        ProductDetail productDetail10 = new ProductDetail();
        var product10 = productService.findById(10L);
        var savedProductDetail10 = productDetailService.save(productDetail10);
        var productBlog10 = new ProductBlog(0L,
                "Quà Tặng Sinh Nhật, Tốt Nghiệp, Quà tặng Bạn Gái Đáng Yêu. Nhận đặt theo mẫu 🥰🥰🥰🥰🥰");
        Image pd10Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwmcgpx1asbd50",
                savedProductDetail10);
        Image pd10Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwmcev6gyndld2",
                savedProductDetail10);
        Image pd10Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwmcgpx19djvc4",
                savedProductDetail10);
        Image pd10Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwmcgpx1q8k988",
                savedProductDetail10);
        Image pd10Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwmcgpx1otsr3d",
                savedProductDetail10);
        var images10 = List.of(pd10Img1, pd10Img2, pd10Img3, pd10Img4, pd10Img5);
        savedProductDetail10.setImageList(images10);
        savedProductDetail10.setProductBlog(productBlog10);
        savedProductDetail10.setProduct(product10);
        savedProductDetail10.setCategoryList(List.of(c1, c4));
        productDetailService.save(savedProductDetail10);

        // Product detail 11
        ProductDetail productDetail11 = new ProductDetail();
        var product11 = productService.findById(11L);
        var savedProductDetail11 = productDetailService.save(productDetail11);
        var productBlog11 = new ProductBlog(0L,
                "Bộ quà tặng ý nghĩa dành cho bạn gái, người thân/bạn bè/người yêu…nhân dịp sinh nhật, lễ kỷ niệm, tiệc chia tay, ra trường, du học.. hay đơn giản là tặng cho chính mình để đem đến 1 niềm vui nho nhỏ");
        Image pd11Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/3b0573d6c6514b45e09bf55b5b86106c",
                savedProductDetail11);
        Image pd11Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/af518ce9fd34525c762ca621abcbfa66",
                savedProductDetail11);
        Image pd11Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/efe4cbdb7b34f93c8a2a120d263a640f",
                savedProductDetail11);
        Image pd11Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/181180276387f17337470316fcb38899",
                savedProductDetail11);
        Image pd11Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/215b125d6e63c0b03d493caa3f9e0209",
                savedProductDetail11);
        var images11 = List.of(pd11Img1, pd11Img2, pd11Img3, pd11Img4, pd11Img5);
        savedProductDetail11.setImageList(images11);
        savedProductDetail11.setProductBlog(productBlog11);
        savedProductDetail11.setProduct(product11);
        savedProductDetail11.setCategoryList(List.of(c1, c4, c5));
        productDetailService.save(savedProductDetail11);

        // Product detail 12
        ProductDetail productDetail12 = new ProductDetail();
        var product12 = productService.findById(12L);
        var savedProductDetail12 = productDetailService.save(productDetail12);
        var productBlog12 = new ProductBlog(0L, "Khung ảnh siêu xinh. Rinh ngay kẻo hết!");
        Image pd12Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ln6w72qao4z7b9",
                savedProductDetail12);
        Image pd12Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lq9p1bwvv00ia2",
                savedProductDetail12);
        Image pd12Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lpxg41r9jnefe1",
                savedProductDetail12);
        Image pd12Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lq9p1bwvfjrm04",
                savedProductDetail12);
        Image pd12Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-liq3403990r095",
                savedProductDetail12);
        var images12 = List.of(pd12Img1, pd12Img2, pd12Img3, pd12Img4, pd12Img5);
        savedProductDetail12.setImageList(images12);
        savedProductDetail12.setProductBlog(productBlog12);
        savedProductDetail12.setProduct(product12);
        savedProductDetail12.setCategoryList(List.of(c1, c3, c4, c6));
        productDetailService.save(savedProductDetail12);

        // Product detail 13
        ProductDetail productDetail13 = new ProductDetail();
        var product13 = productService.findById(13L);
        var savedProductDetail13 = productDetailService.save(productDetail13);
        var productBlog13 = new ProductBlog(0L,
                "❤️ NHẬT KÝ TÌNH YÊU BE WITH YOU ❤️ LOVE CAN MAKE YOU WHOLE AGAIN!");
        Image pd13Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lvanjjui25pgfe",
                savedProductDetail13);
        Image pd13Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lvanjjuhsbqc12",
                savedProductDetail13);
        Image pd13Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lvanjjuhpi8d0e",
                savedProductDetail13);
        Image pd13Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lvanjjuhwjfoa8",
                savedProductDetail13);
        Image pd13Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lvanjjui0r5000",
                savedProductDetail13);
        var images13 = List.of(pd13Img1, pd13Img2, pd13Img3, pd13Img4, pd13Img5);
        savedProductDetail13.setImageList(images13);
        savedProductDetail13.setProductBlog(productBlog13);
        savedProductDetail13.setProduct(product13);
        savedProductDetail13.setCategoryList(List.of(c2, c4));
        productDetailService.save(savedProductDetail13);

        // Product detail 14
        ProductDetail productDetail14 = new ProductDetail();
        var product14 = productService.findById(14L);
        var savedProductDetail14 = productDetailService.save(productDetail14);
        var productBlog14 = new ProductBlog(0L,
                "Album ảnh 6x9, 9x12, 10x15 kiểu bìa da Vintage dán ảnh trực tiếp");
        Image pd14Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lgdmqr5pw5m2f3",
                savedProductDetail14);
        Image pd14Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lj25i3lepdqqe8",
                savedProductDetail14);
        Image pd14Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lj25i3lenz6a46",
                savedProductDetail14);
        Image pd14Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lo3jw97mwhh66c",
                savedProductDetail14);
        Image pd14Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lgdmqr5q1rvue3",
                savedProductDetail14);
        var images14 = List.of(pd14Img1, pd14Img2, pd14Img3, pd14Img4, pd14Img5);
        savedProductDetail14.setImageList(images14);
        savedProductDetail14.setProductBlog(productBlog14);
        savedProductDetail14.setProduct(product14);
        savedProductDetail14.setCategoryList(List.of(c2, c4));
        productDetailService.save(savedProductDetail14);

        // Product detail 15
        ProductDetail productDetail15 = new ProductDetail();
        var product15 = productService.findById(15L);
        var savedProductDetail15 = productDetailService.save(productDetail15);
        var productBlog15 = new ProductBlog(0L,
                "Dành cho: Quà tặng / Bộ sưu tập. Trọn gói: Album ảnh Accordion 1 CÁI");
        Image pd15Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rd61-lu665ws3p6hf47",
                savedProductDetail15);
        Image pd15Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rcbx-lt34cd2bp9ti7e",
                savedProductDetail15);
        Image pd15Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rcd1-lt34e2p7i7z08f",
                savedProductDetail15);
        Image pd15Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rccv-lt34cgr8asizcd",
                savedProductDetail15);
        Image pd15Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rceq-lt34cf3upo5n02",
                savedProductDetail15);
        var images15 = List.of(pd15Img1, pd15Img2, pd15Img3, pd15Img4, pd15Img5);
        savedProductDetail15.setImageList(images15);
        savedProductDetail15.setProductBlog(productBlog15);
        savedProductDetail15.setProduct(product15);
        savedProductDetail15.setCategoryList(List.of(c2, c4));
        productDetailService.save(savedProductDetail15);

        // Product detail 16
        ProductDetail productDetail16 = new ProductDetail();
        var product16 = productService.findById(16L);
        var savedProductDetail16 = productDetailService.save(productDetail16);
        var productBlog16 = new ProductBlog(0L, "❤️CẢM ƠN BẠN ĐÃ GHÉ THĂM GÓC NHỎ CỦA MIU LOVE BOX❤️");
        Image pd16Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lti0qpuuqhhm92",
                savedProductDetail16);
        Image pd16Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lti0qpuukv7uc7",
                savedProductDetail16);
        Image pd16Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lte65t3gi74p84",
                savedProductDetail16);
        Image pd16Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lti0qpuunocqdc",
                savedProductDetail16);
        Image pd16Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lti0qpuup2x6c2",
                savedProductDetail16);
        var images16 = List.of(pd16Img1, pd16Img2, pd16Img3, pd16Img4, pd16Img5);
        savedProductDetail16.setImageList(images16);
        savedProductDetail16.setProductBlog(productBlog16);
        savedProductDetail16.setProduct(product16);
        savedProductDetail16.setCategoryList(List.of(c2, c4));
        productDetailService.save(savedProductDetail16);

        // Product detail 17
        ProductDetail productDetail17 = new ProductDetail();
        var product17 = productService.findById(17L);
        var savedProductDetail17 = productDetailService.save(productDetail17);
        var productBlog17 = new ProductBlog(0L, "Gói bao gồm: 1 Cái Album Ảnh Sổ Lưu Niệm Tự Làm");
        Image pd17Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rd53-lw4m5nfkbfmv29",
                savedProductDetail17);
        Image pd17Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rd46-lw4m5o8p4sj20b",
                savedProductDetail17);
        Image pd17Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rd50-lw4lz9emxjun1a",
                savedProductDetail17);
        Image pd17Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rd5l-lw4midnnrdkr5c",
                savedProductDetail17);
        Image pd17Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rd6z-lw4m5mfhs75g95",
                savedProductDetail17);
        var images17 = List.of(pd17Img1, pd17Img2, pd17Img3, pd17Img4, pd17Img5);
        savedProductDetail17.setImageList(images17);
        savedProductDetail17.setProductBlog(productBlog17);
        savedProductDetail17.setProduct(product17);
        savedProductDetail17.setCategoryList(List.of(c2, c4));
        productDetailService.save(savedProductDetail17);

        // Product detail 18
        ProductDetail productDetail18 = new ProductDetail();
        var product18 = productService.findById(18L);
        var savedProductDetail18 = productDetailService.save(productDetail18);
        var productBlog18 = new ProductBlog(0L, "Xin chào! Chào mừng bạn đến với cửa hàng của chúng tôi");
        Image pd18Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/5848b8d5e8f98a4a845aa56ba1dc77f0",
                savedProductDetail18);
        Image pd18Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/4d97ab51f8deb4154015c7f7d18d0b15",
                savedProductDetail18);
        Image pd18Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/9fe33409deb7b7c8c33e1a62ec67c087",
                savedProductDetail18);
        Image pd18Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/c849b4ae79baf351a891a2c15b7884bb",
                savedProductDetail18);
        Image pd18Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/ce6b92a32d982f63bd36d8f8f4800604",
                savedProductDetail18);
        var images18 = List.of(pd18Img1, pd18Img2, pd18Img3, pd18Img4, pd18Img5);
        savedProductDetail18.setImageList(images18);
        savedProductDetail18.setProductBlog(productBlog18);
        savedProductDetail18.setProduct(product18);
        savedProductDetail18.setCategoryList(List.of(c2, c4));
        productDetailService.save(savedProductDetail18);

        // Product detail 19
        ProductDetail productDetail19 = new ProductDetail();
        var product19 = productService.findById(19L);
        var savedProductDetail19 = productDetailService.save(productDetail19);
        var productBlog19 = new ProductBlog(0L,
                "Scrapbook phong thư mini, sổ dán ảnh đã có sẵn hiệu ứng, quà tặng sinh nhật đáng yêu đựng được tới 43 cái ảnh");
        Image pd19Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-llaioy0ml58630",
                savedProductDetail19);
        Image pd19Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-llaioy0mic3aa0",
                savedProductDetail19);
        Image pd19Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-llaioy0mjqnq72",
                savedProductDetail19);
        Image pd19Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-llaioy0mpcxia8",
                savedProductDetail19);
        Image pd19Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-llaioy0mpcxia8",
                savedProductDetail19);
        var images19 = List.of(pd19Img1, pd19Img2, pd19Img3, pd19Img4, pd19Img5);
        savedProductDetail19.setImageList(images19);
        savedProductDetail19.setProductBlog(productBlog19);
        savedProductDetail19.setProduct(product19);
        savedProductDetail19.setCategoryList(List.of(c2, c4));
        productDetailService.save(savedProductDetail19);

        // Product detail 20
        ProductDetail productDetail20 = new ProductDetail();
        var product20 = productService.findById(20L);
        var savedProductDetail20 = productDetailService.save(productDetail20);
        var productBlog20 = new ProductBlog(0L, "Phù hợp tặng bạn. Người yêu. Lưu giữa những kỷ niệm bên nhau.");
        Image pd20Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/29ef3ddaaad6662936482a1af77e9a5d",
                savedProductDetail20);
        Image pd20Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/eb9dafc2bdee72c7163991987662c4df",
                savedProductDetail20);
        Image pd20Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/e3dd9b7d450f0969f889771d80918eaf",
                savedProductDetail20);
        Image pd20Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/e731058aa6c8f9e33e80a0f4c6942be3",
                savedProductDetail20);
        Image pd20Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/d228a78db42e6b3a1ce3bc8513f58067",
                savedProductDetail20);
        var images20 = List.of(pd20Img1, pd20Img2, pd20Img3, pd20Img4, pd20Img5);
        savedProductDetail20.setImageList(images20);
        savedProductDetail20.setProductBlog(productBlog20);
        savedProductDetail20.setProduct(product20);
        savedProductDetail20.setCategoryList(List.of(c2, c4));
        productDetailService.save(savedProductDetail20);

        // Product detail 21
        ProductDetail productDetail21 = new ProductDetail();
        var product21 = productService.findById(21L);
        var savedProductDetail21 = productDetailService.save(productDetail21);
        var productBlog21 = new ProductBlog(0L,
                "Thông tin sản phẩm + Kích thước: Bìa 23x23cm, Giấy 21x21cm + Màu sắc: Đen: Tổng 54 trang cả bìa, cứ 4 tờ đen có 1 tờ trắng, tổng 25 tờ");
        Image pd21Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-loexc1ug55o327",
                savedProductDetail21);
        Image pd21Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-loexc1ugklwzda",
                savedProductDetail21);
        Image pd21Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-loexc1ug6k8jae",
                savedProductDetail21);
        Image pd21Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwmeymh8y09n03",
                savedProductDetail21);
        Image pd21Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwmeymkusq8rfb",
                savedProductDetail21);
        var images21 = List.of(pd21Img1, pd21Img2, pd21Img3, pd21Img4, pd21Img5);
        savedProductDetail21.setImageList(images21);
        savedProductDetail21.setProductBlog(productBlog21);
        savedProductDetail21.setProduct(product21);
        savedProductDetail21.setCategoryList(List.of(c2));
        productDetailService.save(savedProductDetail21);

        // Product detail 22
        ProductDetail productDetail22 = new ProductDetail();
        var product22 = productService.findById(22L);
        var savedProductDetail22 = productDetailService.save(productDetail22);
        var productBlog22 = new ProductBlog(0L, "Tính năng: 1. Đường viền khắc Laser, đẹp. 2. Bật nhạc và đèn.");
        Image pd22Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/dc20e81f4357f5c712a992fffde9ef21",
                savedProductDetail22);
        Image pd22Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/a5f6e2226a9eddca42e34ce1035bbf6f",
                savedProductDetail22);
        Image pd22Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/ae2e958e05c8e82b9e93b00c2d6895b5",
                savedProductDetail22);
        Image pd22Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/af4f866f524dc8f3fa0bd9cbccbbc1fd",
                savedProductDetail22);
        Image pd22Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/5a79a7b9a0495681ca71044381937de6",
                savedProductDetail22);
        var images22 = List.of(pd22Img1, pd22Img2, pd22Img3, pd22Img4, pd22Img5);
        savedProductDetail22.setImageList(images22);
        savedProductDetail22.setProductBlog(productBlog22);
        savedProductDetail22.setProduct(product22);
        savedProductDetail22.setCategoryList(List.of(c4, c5));
        productDetailService.save(savedProductDetail22);

        // Product detail 23
        ProductDetail productDetail23 = new ProductDetail();
        var product23 = productService.findById(23L);
        var savedProductDetail23 = productDetailService.save(productDetail23);
        var productBlog23 = new ProductBlog(0L,
                "Các Giá trị hiển thị trên trang chi tiết có thể có sai số 1-2cm trong các tình huống thực tế (bao gồm cả vị trí của các lỗ bên)");
        Image pd23Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rbl7-lnjjfqcldo35c0",
                savedProductDetail23);
        Image pd23Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rbkk-lnjjfrmni9sub2",
                savedProductDetail23);
        Image pd23Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rbna-lnjjfsw5novkf3",
                savedProductDetail23);
        Image pd23Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rbkv-lnjjfu7btgqtb4",
                savedProductDetail23);
        Image pd23Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rbk0-lnifc9xt0301a3",
                savedProductDetail23);
        var images23 = List.of(pd23Img1, pd23Img2, pd23Img3, pd23Img4, pd23Img5);
        savedProductDetail23.setImageList(images23);
        savedProductDetail23.setProductBlog(productBlog23);
        savedProductDetail23.setProduct(product23);
        savedProductDetail23.setCategoryList(List.of(c2));
        productDetailService.save(savedProductDetail23);

        // Product detail 24
        ProductDetail productDetail24 = new ProductDetail();
        var product24 = productService.findById(24L);
        var savedProductDetail24 = productDetailService.save(productDetail24);
        var productBlog24 = new ProductBlog(0L,
                "Một món quà vô cùng độc đáo và ý nghĩa được bạn lựa chọn để mang niềm vui tặng đến ai đó. Góc Nhà tin rằng, khi bạn dùng love box để tặng quà cho bất kì ai, họ cũng đều sẽ rất thích thú với món quà này.");
        Image pd24Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/723e251cd3271577cc914de02255c041",
                savedProductDetail24);
        Image pd24Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/3cbab497033aef7a0bc1e9402809a401",
                savedProductDetail24);
        Image pd24Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/3d327ce53bdf0d1f68fc3c5709c677ba",
                savedProductDetail24);
        Image pd24Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/5b6689c074ce7a9ebf8441902e948c07",
                savedProductDetail24);
        Image pd24Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/f5952bcc34e31cdd490c2547af490cfb",
                savedProductDetail24);
        var images24 = List.of(pd24Img1, pd24Img2, pd24Img3, pd24Img4, pd24Img5);
        savedProductDetail24.setImageList(images24);
        savedProductDetail24.setProductBlog(productBlog24);
        savedProductDetail24.setProduct(product24);
        savedProductDetail24.setCategoryList(List.of(c1, c2, c4, c5));
        productDetailService.save(savedProductDetail24);

        // Product detail 25
        ProductDetail productDetail25 = new ProductDetail();
        var product25 = productService.findById(25L);
        var savedProductDetail25 = productDetailService.save(productDetail25);
        var productBlog25 = new ProductBlog(0L,
                "Khung sâu lòng 2 cm. chân dựng chắc chắn kèm móc treo (có thể để bàn hay treo tường đều được).");
        Image pd25Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lqhuy912tkc7db",
                savedProductDetail25);
        Image pd25Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lqhf8i19swk260",
                savedProductDetail25);
        Image pd25Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lqhuy9137lqq9d",
                savedProductDetail25);
        Image pd25Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lqhuy912wdh32f",
                savedProductDetail25);
        Image pd25Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/072dced42337d5021637cd2f865bd90b",
                savedProductDetail25);
        var images25 = List.of(pd25Img1, pd25Img2, pd25Img3, pd25Img4, pd25Img5);
        savedProductDetail25.setImageList(images25);
        savedProductDetail25.setProductBlog(productBlog25);
        savedProductDetail25.setProduct(product25);
        savedProductDetail25.setCategoryList(List.of(c3, c5));
        productDetailService.save(savedProductDetail25);

        // Product detail 26
        ProductDetail productDetail26 = new ProductDetail();
        var product26 = productService.findById(26L);
        var savedProductDetail26 = productDetailService.save(productDetail26);
        var productBlog26 = new ProductBlog(0L,
                "Ở đây có khung ảnh lưu niệm, dạng khung tranh 3D, lòng sâu, các chi tiết sẽ được làm nổi bên trong lòng khung tạo chiều sâu cho ảnh!");
        Image pd26Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-llti2vt3z9pbae",
                savedProductDetail26);
        Image pd26Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lfr7p3v5oohj51",
                savedProductDetail26);
        Image pd26Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134201-23020-haipwcv0rpnvd9",
                savedProductDetail26);
        Image pd26Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lrui76va10ux97",
                savedProductDetail26);
        Image pd26Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lrui76va3tzta6",
                savedProductDetail26);
        var images26 = List.of(pd26Img1, pd26Img2, pd26Img3, pd26Img4, pd26Img5);
        savedProductDetail26.setImageList(images26);
        savedProductDetail26.setProductBlog(productBlog26);
        savedProductDetail26.setProduct(product26);
        savedProductDetail26.setCategoryList(List.of(c3));
        productDetailService.save(savedProductDetail26);

        // Product detail 27
        ProductDetail productDetail27 = new ProductDetail();
        var product27 = productService.findById(27L);
        var savedProductDetail27 = productDetailService.save(productDetail27);
        var productBlog27 = new ProductBlog(0L, "Khung ảnh kỉ niệm với chủ đề dễ thương.");
        Image pd27Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lh4x9mccmo8i55",
                savedProductDetail27);
        Image pd27Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lh4x9mcdhkqa02",
                savedProductDetail27);
        Image pd27Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lh4x9mccmodv85",
                savedProductDetail27);
        Image pd27Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lh4x9mdgl1rm56",
                savedProductDetail27);
        Image pd27Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lh4x9meajtwy4b",
                savedProductDetail27);
        var images27 = List.of(pd27Img1, pd27Img2, pd27Img3, pd27Img4, pd27Img5);
        savedProductDetail27.setImageList(images27);
        savedProductDetail27.setProductBlog(productBlog27);
        savedProductDetail27.setProduct(product27);
        savedProductDetail27.setCategoryList(List.of(c3, c4));
        productDetailService.save(savedProductDetail27);

        // Product detail 28
        ProductDetail productDetail28 = new ProductDetail();
        var product28 = productService.findById(28L);
        var savedProductDetail28 = productDetailService.save(productDetail28);
        var productBlog28 = new ProductBlog(0L,
                "🔸 𝐊𝐡𝐮𝐧𝐠 𝐚̉𝐧𝐡 𝐭𝐫𝐚𝐧𝐠 𝐭𝐫𝐢́ 𝐭𝐡𝐮̉ 𝐜𝐨̂𝐧𝐠 𝐛𝐚̆̀𝐧𝐠 𝐜𝐡𝐮̛̃ 𝐯𝐢𝐞̂́𝐭 𝐭𝐚𝐲 là mnột sản phẩm cực HOT tại Nomad đó!");
        Image pd28Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-22100-tqlamiwlbaiv3b",
                savedProductDetail28);
        Image pd28Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lnmfsgrspfjh3d",
                savedProductDetail28);
        Image pd28Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lufpk5g6vua9e8",
                savedProductDetail28);
        Image pd28Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lufpk5g6x8upaf",
                savedProductDetail28);
        Image pd28Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lufpk5g6t15d03",
                savedProductDetail28);
        var images28 = List.of(pd28Img1, pd28Img2, pd28Img3, pd28Img4, pd28Img5);
        savedProductDetail28.setImageList(images28);
        savedProductDetail28.setProductBlog(productBlog28);
        savedProductDetail28.setProduct(product28);
        savedProductDetail28.setCategoryList(List.of(c3, c4));
        productDetailService.save(savedProductDetail28);

        // Product detail 29
        ProductDetail productDetail29 = new ProductDetail();
        var product29 = productService.findById(29L);
        var savedProductDetail29 = productDetailService.save(productDetail29);
        var productBlog29 = new ProductBlog(0L,
                "Combo khung dây + ảnh treo tường in theo yêu cầu - khung ảnh treo tường gỗ tự nhiên");
        Image pd29Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lu594ke0ccnzad",
                savedProductDetail29);
        Image pd29Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lt9h9tnuab2x41",
                savedProductDetail29);
        Image pd29Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ltffbae5hl3h08",
                savedProductDetail29);
        Image pd29Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ltffbae5ke8daf",
                savedProductDetail29);
        Image pd29Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ltffbae5olxp89",
                savedProductDetail29);
        var images29 = List.of(pd29Img1, pd29Img2, pd29Img3, pd29Img4, pd29Img5);
        savedProductDetail29.setImageList(images29);
        savedProductDetail29.setProductBlog(productBlog29);
        savedProductDetail29.setProduct(product29);
        savedProductDetail29.setCategoryList(List.of(c1, c3));
        productDetailService.save(savedProductDetail29);

        // Product detail 30
        ProductDetail productDetail30 = new ProductDetail();
        var product30 = productService.findById(30L);
        var savedProductDetail30 = productDetailService.save(productDetail30);
        var productBlog30 = new ProductBlog(0L, "Khung ảnh treo tường Kích thước cân đối.");
        Image pd30Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/99ccdb438389cc67868ec630acb38a67",
                savedProductDetail30);
        Image pd30Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/e6ef899a507979c3db4de677ea80e299",
                savedProductDetail30);
        Image pd30Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/850cdcb05c713c7f512af1b511567660",
                savedProductDetail30);
        Image pd30Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/99ccdb438389cc67868ec630acb38a67",
                savedProductDetail30);
        Image pd30Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/9f34557cf24bb2f7fba7b76c71c7c753",
                savedProductDetail30);
        var images30 = List.of(pd30Img1, pd30Img2, pd30Img3, pd30Img4, pd30Img5);
        savedProductDetail30.setImageList(images30);
        savedProductDetail30.setProductBlog(productBlog30);
        savedProductDetail30.setProduct(product30);
        savedProductDetail30.setCategoryList(List.of(c3));
        productDetailService.save(savedProductDetail30);

        // Product Detail 31
        ProductDetail productDetail31 = new ProductDetail();
        var product31 = productService.findById(31L);
        var savedProductDetail31 = productDetailService.save(productDetail31);
        var productBlog31 = new ProductBlog(0L,
                "Sản phẩm chỉ bao khung ảnh gỗ, 02 tấm kính mica được bọc bằng giấy vui lòng bóc giấy trước khi sử dụng ( không bao gồm các đồ dùng trang trí).");
        Image pd31Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-23020-1zrnqxckl7mvd7",
                savedProductDetail31);
        Image pd31Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-23020-o63hf4ekl7mvbb",
                savedProductDetail31);
        Image pd31Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-23020-k3971ngkl7mvc9",
                savedProductDetail31);
        Image pd31Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-23020-m05iiynkl7mv18",
                savedProductDetail31);
        Image pd31Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-23020-7kztaaikl7mve3",
                savedProductDetail31);
        var images31 = List.of(pd31Img1, pd31Img2, pd31Img3, pd31Img4, pd31Img5);
        savedProductDetail31.setImageList(images31);
        savedProductDetail31.setProductBlog(productBlog31);
        savedProductDetail31.setProduct(product31);
        savedProductDetail31.setCategoryList(List.of(c3));
        productDetailService.save(savedProductDetail31);

        // Product Detail 32
        ProductDetail productDetail32 = new ProductDetail();
        var product32 = productService.findById(32L);
        var savedProductDetail32 = productDetailService.save(productDetail32);
        var productBlog32 = new ProductBlog(0L,
                "Khung ảnh để bàn - Khung hình để bàn.Giá chỉ bao gồm 1 khung ảnh ,không bao gồm hoa khô,hoa giả hay ảnh kèm theo.Hình thật ảnh số 2.Kích thước tính bên ngoài khung ảnh Với thiết kế tinh tế!");
        Image pd32Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-22100-cambl1qwwuivca",
                savedProductDetail32);
        Image pd32Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lm096knkqm73cb",
                savedProductDetail32);
        Image pd32Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-22100-m14ggz9rwuivd5",
                savedProductDetail32);
        Image pd32Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-22110-8njwzjx4jejv56",
                savedProductDetail32);
        Image pd32Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-22100-0u481w7cxuiva5",
                savedProductDetail32);
        var images32 = List.of(pd32Img1, pd32Img2, pd32Img3, pd32Img4, pd32Img5);
        savedProductDetail32.setImageList(images32);
        savedProductDetail32.setProductBlog(productBlog32);
        savedProductDetail32.setProduct(product32);
        savedProductDetail32.setCategoryList(List.of(c3));
        productDetailService.save(savedProductDetail32);

        // Product Detail 33
        ProductDetail productDetail33 = new ProductDetail();
        var product33 = productService.findById(33L);
        var savedProductDetail33 = productDetailService.save(productDetail33);
        var productBlog33 = new ProductBlog(0L,
                "Khung Ảnh Để Bàn Chữ L SÁNG TẠO 2 Mặt Trong Suốt (10x15, 14x21 cm) KA08");
        Image pd33Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lg66863vjz07e4",
                savedProductDetail33);
        Image pd33Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lg66863vldkn86",
                savedProductDetail33);
        Image pd33Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lg66863vo6pje3",
                savedProductDetail33);
        Image pd33Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lg66863vpl9z41",
                savedProductDetail33);
        Image pd33Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lg6djklyxyif0f",
                savedProductDetail33);
        var images33 = List.of(pd33Img1, pd33Img2, pd33Img3, pd33Img4, pd33Img5);
        savedProductDetail33.setImageList(images33);
        savedProductDetail33.setProductBlog(productBlog33);
        savedProductDetail33.setProduct(product33);
        savedProductDetail33.setCategoryList(List.of(c3));
        productDetailService.save(savedProductDetail33);

        // Product Detail 34
        ProductDetail productDetail34 = new ProductDetail();
        var product34 = productService.findById(34L);
        var savedProductDetail34 = productDetailService.save(productDetail34);
        var productBlog34 = new ProductBlog(0L,
                "* Chất liệu: - Gỗ thông nhập - Mặt trong suốt: chất liệu nhựa Mica dày dặn giúp hạn chế việc bể vỡ nếu bị rơi.( tấm kính mica được bọc bằng giấy, các bạn hãy bóc ra trước khi sử dụng nhé)");
        Image pd34Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lm5iltpb8g6707",
                savedProductDetail34);
        Image pd34Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lm4vaa2q35r38e",
                savedProductDetail34);
        Image pd34Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lm4vaa2q4kbj4c",
                savedProductDetail34);
        Image pd34Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lm5fa8qp0vrz90",
                savedProductDetail34);
        Image pd34Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lm5fa8v4udwf4e",
                savedProductDetail34);
        var images34 = List.of(pd34Img1, pd34Img2, pd34Img3, pd34Img4, pd34Img5);
        savedProductDetail34.setImageList(images34);
        savedProductDetail34.setProductBlog(productBlog34);
        savedProductDetail34.setProduct(product34);
        savedProductDetail34.setCategoryList(List.of(c3));
        productDetailService.save(savedProductDetail34);

        // Product Detail 35
        ProductDetail productDetail35 = new ProductDetail();
        var product35 = productService.findById(35L);
        var savedProductDetail35 = productDetailService.save(productDetail35);
        var productBlog35 = new ProductBlog(0L,
                "Thiệp hoa khô, thiệp handmade vintage đen sang trọng dùng decor, quà valentine, 8/3, 20/10, giáng sinh, sinh nhật.");
        Image pd35Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lsh3mjzot7rtee",
                savedProductDetail35);
        Image pd35Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lsh3mjzoksd5ae",
                savedProductDetail35);
        Image pd35Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lsh3mjzom6xld7",
                savedProductDetail35);
        Image pd35Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lsh3mjzotnax25",
                savedProductDetail35);
        Image pd35Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lsh3mjzosqxs1f",
                savedProductDetail35);
        var images35 = List.of(pd35Img1, pd35Img2, pd35Img3, pd35Img4, pd35Img5);
        savedProductDetail35.setImageList(images35);
        savedProductDetail35.setProductBlog(productBlog35);
        savedProductDetail35.setProduct(product35);
        savedProductDetail35.setCategoryList(List.of(c3));
        productDetailService.save(savedProductDetail35);

        // Product Detail 36
        ProductDetail productDetail36 = new ProductDetail();
        var product36 = productService.findById(36L);
        var savedProductDetail36 = productDetailService.save(productDetail36);
        var productBlog36 = new ProductBlog(0L,
                "Khung ảnh 2 trong 1 Vừa Để Bàn Vừa Treo Tường phong cách Châu Âu sang trọng KA24");
        Image pd36Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lge6evj7p4n38d",
                savedProductDetail36);
        Image pd36Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lge6evj7p1ov3e",
                savedProductDetail36);
        Image pd36Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lge6evj7okknc4",
                savedProductDetail36);
        Image pd36Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lge6evj7r48vdb",
                savedProductDetail36);
        Image pd36Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lge6evj7ntnz79",
                savedProductDetail36);
        var images36 = List.of(pd36Img1, pd36Img2, pd36Img3, pd36Img4, pd36Img5);
        savedProductDetail36.setImageList(images36);
        savedProductDetail36.setProductBlog(productBlog36);
        savedProductDetail36.setProduct(product36);
        savedProductDetail36.setCategoryList(List.of(c3));
        productDetailService.save(savedProductDetail36);

        // Product Detail 37
        ProductDetail productDetail37 = new ProductDetail();
        var product37 = productService.findById(37L);
        var savedProductDetail37 = productDetailService.save(productDetail37);
        var productBlog37 = new ProductBlog(0L, "KHUNG ẢNH VUÔNG 20x20 cm ĐỂ BÀN VÀ TREO TƯỜNG KIỂU CHÂU ÂU");
        Image pd37Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lg0neuycz5yl0a",
                savedProductDetail37);
        Image pd37Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lg0neyylz5ykfc",
                savedProductDetail37);
        Image pd37Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lg0neyz4z5yl63",
                savedProductDetail37);
        Image pd37Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lg0neym6z5yl2a",
                savedProductDetail37);
        Image pd37Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lg0neyw5z5yl45",
                savedProductDetail37);
        var images37 = List.of(pd37Img1, pd37Img2, pd37Img3, pd37Img4, pd37Img5);
        savedProductDetail37.setImageList(images37);
        savedProductDetail37.setProductBlog(productBlog37);
        savedProductDetail37.setProduct(product37);
        savedProductDetail37.setCategoryList(List.of(c3));
        productDetailService.save(savedProductDetail37);

        // Product Detail 38
        ProductDetail productDetail38 = new ProductDetail();
        var product38 = productService.findById(38L);
        var savedProductDetail38 = productDetailService.save(productDetail38);
        var productBlog38 = new ProductBlog(0L,
                "KHUNG ẢNH TREO TƯỜNG VUÔNG KÍCH THƯỚC 15X15 CM PHONG CÁCH CHÂU ÂU KA40");
        Image pd38Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lg7e79z8vqr72d",
                savedProductDetail38);
        Image pd38Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lg7e79zgzqr75a",
                savedProductDetail38);
        Image pd38Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lg7e79zyzqr71d",
                savedProductDetail38);
        Image pd38Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lg7e79zxzqr7ab",
                savedProductDetail38);
        Image pd38Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lg7e79zuzqr7f7",
                savedProductDetail38);
        var images38 = List.of(pd38Img1, pd38Img2, pd38Img3, pd38Img4, pd38Img5);
        savedProductDetail38.setImageList(images38);
        savedProductDetail38.setProductBlog(productBlog38);
        savedProductDetail38.setProduct(product38);
        savedProductDetail38.setCategoryList(List.of(c3));
        productDetailService.save(savedProductDetail38);

        // Product Detail 39
        ProductDetail productDetail39 = new ProductDetail();
        var product39 = productService.findById(39L);
        var savedProductDetail39 = productDetailService.save(productDetail39);
        var productBlog39 = new ProductBlog(0L,
                "Thiệp Chúc Mừng Vintage Cao Cấp LALUNA.CENT - Thư Cảm Ơn Quà Tặng Bạn Bè Người Thân");
        Image pd39Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-loid9gqa3ylv45",
                savedProductDetail39);
        Image pd39Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-loid9gqaf73r76",
                savedProductDetail39);
        Image pd39Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-loid9gqauncn3c",
                savedProductDetail39);
        Image pd39Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-loid9gr3j2rbfb",
                savedProductDetail39);
        Image pd39Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-loid9gq9oiczea",
                savedProductDetail39);
        var images39 = List.of(pd39Img1, pd39Img2, pd39Img3, pd39Img4, pd39Img5);
        savedProductDetail39.setImageList(images39);
        savedProductDetail39.setProductBlog(productBlog39);
        savedProductDetail39.setProduct(product39);
        savedProductDetail39.setCategoryList(List.of(c4, c5)); // Assuming c4 and c5 are your category objects
        productDetailService.save(savedProductDetail39);

        // Product Detail 40
        ProductDetail productDetail40 = new ProductDetail();
        var product40 = productService.findById(40L);
        var savedProductDetail40 = productDetailService.save(productDetail40);
        var productBlog40 = new ProductBlog(0L,
                "Thiệp quà tặng Tình yêu \"I love you\" \"To my dear\"");
        Image pd40Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwe7ae12owrf59",
                savedProductDetail40);
        Image pd40Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwe7ae12owyh6d",
                savedProductDetail40);
        Image pd40Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwe7ae134d0bdb",
                savedProductDetail40);
        Image pd40Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwe7ae13jtg94a",
                savedProductDetail40);
        Image pd40Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwe7ae13jt9782",
                savedProductDetail40);
        var images40 = List.of(pd40Img1, pd40Img2, pd40Img3, pd40Img4, pd40Img5);
        savedProductDetail40.setImageList(images40);
        savedProductDetail40.setProductBlog(productBlog40);
        savedProductDetail40.setProduct(product40);
        savedProductDetail40.setCategoryList(List.of(c4, c5)); // Assuming c4 and c5 are your category objects
        productDetailService.save(savedProductDetail40);

        // Product Detail 41
        ProductDetail productDetail41 = new ProductDetail();
        var product41 = productService.findById(41L);
        var savedProductDetail41 = productDetailService.save(productDetail41);
        var productBlog41 = new ProductBlog(0L,
                "Thiệp Giấy Gấp Ba Mini Greeting Card Caro Hoạt Hình Hình Nổi Pop Up 3D TTH");
        Image pd41Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lfe8sw5grq0l4b",
                savedProductDetail41);
        Image pd41Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lfe8sw5gowvp02",
                savedProductDetail41);
        Image pd41Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lfe9tavc10g481",
                savedProductDetail41);
        Image pd41Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lfe9tavcauf885",
                savedProductDetail41);
        Image pd41Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lfe8sw5gt4l192",
                savedProductDetail41);
        var images41 = List.of(pd41Img1, pd41Img2, pd41Img3, pd41Img4, pd41Img5);
        savedProductDetail41.setImageList(images41);
        savedProductDetail41.setProductBlog(productBlog41);
        savedProductDetail41.setProduct(product41);
        savedProductDetail41.setCategoryList(List.of(c4, c5)); // Assuming c4 and c5 are your category objects
        productDetailService.save(savedProductDetail41);

        // Product Detail 42
        ProductDetail productDetail42 = new ProductDetail();
        var product42 = productService.findById(42L);
        var savedProductDetail42 = productDetailService.save(productDetail42);
        var productBlog42 = new ProductBlog(0L,
                "Thiệp sinh nhật, kỷ niệm handmade bó hoa khô ngày tháng tặng kèm bao thư kraft và trái tim");
        Image pd42Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134211-7r98o-lt0judqi2emx7e",
                savedProductDetail42);
        Image pd42Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134211-7r98o-lt0judqi3t7d8d",
                savedProductDetail42);
        Image pd42Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134211-7r98o-lt0judqmcx5012",
                savedProductDetail42);
        Image pd42Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134211-7r98o-lt0judqmebpg6b",
                savedProductDetail42);
        Image pd42Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134211-7r98o-lt0judqmfq9w23",
                savedProductDetail42);
        var images42 = List.of(pd42Img1, pd42Img2, pd42Img3, pd42Img4, pd42Img5);
        savedProductDetail42.setImageList(images42);
        savedProductDetail42.setProductBlog(productBlog42);
        savedProductDetail42.setProduct(product42);
        savedProductDetail42.setCategoryList(List.of(c4, c5)); // Assuming c4 and c5 are your category objects
        productDetailService.save(savedProductDetail42);

        // Product Detail 43
        ProductDetail productDetail43 = new ProductDetail();
        var product43 = productService.findById(43L);
        var savedProductDetail43 = productDetailService.save(productDetail43);
        var productBlog43 = new ProductBlog(0L,
                "PVN62594 Thiệp Giấy Thủ Công Phối Hoa Khô Làm Quà Tặng Ngày Của Mẹ -Sinh Nhật - Ngày Lễ Tình Nhân - Quốc tế phụ nữ");
        Image pd43Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134201-7r98o-lq1y3wlbrxo781",
                savedProductDetail43);
        Image pd43Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rbl1-lpt79o0g4hok48",
                savedProductDetail43);
        Image pd43Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rbl1-lpt79o0ftulbd5",
                savedProductDetail43);
        Image pd43Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rbl1-lpt79o0fsrg76m",
                savedProductDetail43);
        Image pd43Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/sg-11134201-7rbl1-lpt79o0g0mfyf2",
                savedProductDetail43);
        var images43 = List.of(pd43Img1, pd43Img2, pd43Img3, pd43Img4, pd43Img5);
        savedProductDetail43.setImageList(images43);
        savedProductDetail43.setProductBlog(productBlog43);
        savedProductDetail43.setProduct(product43);
        savedProductDetail43.setCategoryList(List.of(c4, c5)); // Assuming c4 and c5 are your category objects
        productDetailService.save(savedProductDetail43);

        // Product Detail 44
        ProductDetail productDetail44 = new ProductDetail();
        var product44 = productService.findById(44L);
        var savedProductDetail44 = productDetailService.save(productDetail44);
        var productBlog44 = new ProductBlog(0L,
                "Thiệp chúc mừng sinh nhật Hàn Quốc Làm thủ công Nổi bật Nhiều loại rất là đẹp Hiện đại Ngọt ngào Hình con thú ngộ nghĩnh Kiểu cắt");
        Image pd44Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134211-7r98o-lt0judqi2emx7e",
                savedProductDetail44);
        Image pd44Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134211-7r98o-lt0judqi3t7d8d",
                savedProductDetail44);
        Image pd44Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134211-7r98o-lt0judqmcx5012",
                savedProductDetail44);
        Image pd44Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134211-7r98o-lt0judqmebpg6b",
                savedProductDetail44);
        Image pd44Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134211-7r98o-lt0judqmfq9w23",
                savedProductDetail44);
        var images44 = List.of(pd44Img1, pd44Img2, pd44Img3, pd44Img4, pd44Img5);
        savedProductDetail44.setImageList(images44);
        savedProductDetail44.setProductBlog(productBlog44);
        savedProductDetail44.setProduct(product44);
        savedProductDetail44.setCategoryList(List.of(c4, c5)); // Assuming c4 and c5 are your category objects
        productDetailService.save(savedProductDetail44);

        // Product Detail 45
        ProductDetail productDetail45 = new ProductDetail();
        var product45 = productService.findById(45L);
        var savedProductDetail45 = productDetailService.save(productDetail45);
        var productBlog45 = new ProductBlog(0L,
                "Thiệp Handmade hoa khô bao thư + ruột thiệp");
        Image pd45Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134211-7r98o-lt0judqhzlj85d",
                savedProductDetail45);
        Image pd45Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134211-7r98o-lt0judqi2eo45a",
                savedProductDetail45);
        Image pd45Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134211-7r98o-lt0judqi57t08f",
                savedProductDetail45);
        Image pd45Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134211-7r98o-lt0judqi80xwdd",
                savedProductDetail45);
        Image pd45Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134211-7r98o-lt0judqi9ficeb",
                savedProductDetail45);
        var images45 = List.of(pd45Img1, pd45Img2, pd45Img3, pd45Img4, pd45Img5);
        savedProductDetail45.setImageList(images45);
        savedProductDetail45.setProductBlog(productBlog45);
        savedProductDetail45.setProduct(product45);
        savedProductDetail45.setCategoryList(List.of(c4, c5)); // Assuming c4 and c5 are your category objects
        productDetailService.save(savedProductDetail45);

        // Product Detail 46
        ProductDetail productDetail46 = new ProductDetail();
        var product46 = productService.findById(46L);
        var savedProductDetail46 = productDetailService.save(productDetail46);
        var productBlog46 = new ProductBlog(0L,
                "**Đồ Handmade Tự Làm Quà Sinh Nhật, Set Tự Làm Đèn Hoa Tulip Khung Vuông Tráng Gương, Làm Quà Tặng**!");
        Image pd46Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwy67ac6tqs9db",
                savedProductDetail46);
        Image pd46Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwy67ac6lbdl5e",
                savedProductDetail46);
        Image pd46Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwy67ac6mpy1eb",
                savedProductDetail46);
        Image pd46Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwy67ac6o4ih10",
                savedProductDetail46);
        Image pd46Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwy67ac6qxndee",
                savedProductDetail46);
        var images46 = List.of(pd46Img1, pd46Img2, pd46Img3, pd46Img4, pd46Img5);
        savedProductDetail46.setImageList(images46);
        savedProductDetail46.setProductBlog(productBlog46);
        savedProductDetail46.setProduct(product46);
        savedProductDetail46.setCategoryList(List.of(c1, c4, c6)); // Assuming c1, c4, c6 are your category objects
        productDetailService.save(savedProductDetail46);

        // Product Detail 47
        ProductDetail productDetail47 = new ProductDetail();
        var product47 = productService.findById(47L);
        var savedProductDetail47 = productDetailService.save(productDetail47);
        var productBlog47 = new ProductBlog(0L,
                "DIY Đèn Tulip hình Đám Mây Gương Handmade Trang Trí Phòng Ngủ Dùng Làm Quà Tặng Sinh Nhật Đèn ngủ, làm gương - Erashop");
        Image pd47Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-luyyoomeaotha2",
                savedProductDetail47);
        Image pd47Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-luyyoomec3dx45",
                savedProductDetail47);
        Image pd47Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lvjtmn72tyfhd6",
                savedProductDetail47);
        Image pd47Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-luyyoomehpnpf4",
                savedProductDetail47);
        Image pd47Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lvjtmn72vczx09",
                savedProductDetail47);
        var images47 = List.of(pd47Img1, pd47Img2, pd47Img3, pd47Img4, pd47Img5);
        savedProductDetail47.setImageList(images47);
        savedProductDetail47.setProductBlog(productBlog47);
        savedProductDetail47.setProduct(product47);
        savedProductDetail47.setCategoryList(List.of(c1, c4, c6)); // Assuming c1, c4, c6 are your category objects
        productDetailService.save(savedProductDetail47);

        // Product Detail 48
        ProductDetail productDetail48 = new ProductDetail();
        var product48 = productService.findById(48L);
        var savedProductDetail48 = productDetailService.save(productDetail48);
        var productBlog48 = new ProductBlog(0L,
                "🌷[DIY] Đèn hoa tulip tự làm handmade, đèn hoa tulip sang trọng làm quà tặnG người yêu  Valentine 14/3 , sinh nhật");
        Image pd48Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ltcp8fyc9gnt68",
                savedProductDetail48);
        Image pd48Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lueqrjii34f35f",
                savedProductDetail48);
        Image pd48Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ltcp8fycav8955",
                savedProductDetail48);
        Image pd48Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lueqrjii4izj1d",
                savedProductDetail48);
        Image pd48Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ltcp8fycc9sp94",
                savedProductDetail48);
        var images48 = List.of(pd48Img1, pd48Img2, pd48Img3, pd48Img4, pd48Img5);
        savedProductDetail48.setImageList(images48);
        savedProductDetail48.setProductBlog(productBlog48);
        savedProductDetail48.setProduct(product48);
        savedProductDetail48.setCategoryList(List.of(c1, c4, c6)); // Assuming c1, c4, c6 are your category objects
        productDetailService.save(savedProductDetail48);

        // Product Detail 49
        ProductDetail productDetail49 = new ProductDetail();
        var product49 = productService.findById(49L);
        var savedProductDetail49 = productDetailService.save(productDetail49);
        var productBlog49 = new ProductBlog(0L,
                "DIY Bó hoa hình Bướm 🦋 handmade full phụ kiện tự làm quà tặng sinh nhật bạn gái, quà tặng người yêu Valentine");
        Image pd49Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ls33ptqrlhvo88",
                savedProductDetail49);
        Image pd49Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ls33ptqrppl076",
                savedProductDetail49);
        Image pd49Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ls33ptqrob0k07",
                savedProductDetail49);
        Image pd49Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lqaqszocqjp381",
                savedProductDetail49);
        Image pd49Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lqaqszobvmxe2e",
                savedProductDetail49);
        var images49 = List.of(pd49Img1, pd49Img2, pd49Img3, pd49Img4, pd49Img5);
        savedProductDetail49.setImageList(images49);
        savedProductDetail49.setProductBlog(productBlog49);
        savedProductDetail49.setProduct(product49);
        savedProductDetail49.setCategoryList(List.of(c1, c4, c6)); // Assuming c1, c4, c6 are your category objects
        productDetailService.save(savedProductDetail49);

        // Product detail 50
        ProductDetail productDetail50 = new ProductDetail();
        var product50 = productService.findById(50L);
        var savedProductDetai50 = productDetailService.save(productDetail50);
        var productBlog50 = new ProductBlog(0L,
                "[DIY] Set Nguyên liệu móc bạch tuộc làm móc khóa - Nhiều màu, kèm hướng dẫn chi tiết - Làm quà tặng mang nhiều ý nghĩa.");
        Image pd50Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lihb6q75zhea54",
                savedProductDetai50);
        Image pd50Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lqtcegp80n2q67",
                savedProductDetai50);
        Image pd50Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lihb6q6wfbpoff",
                savedProductDetai50);
        Image pd50Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lihb6q75zguk23",
                savedProductDetai50);
        Image pd50Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lihb6q6vzw0i8b",
                savedProductDetai50);
        var images50 = List.of(pd50Img1, pd50Img2, pd50Img3, pd50Img4, pd50Img5);
        savedProductDetai50.setImageList(images50);
        savedProductDetai50.setProductBlog(productBlog50);
        savedProductDetai50.setProduct(product50);
        savedProductDetai50.setCategoryList(List.of(c1, c4, c6));
        productDetailService.save(savedProductDetai50);

        // Product detail 51
        ProductDetail productDetail51 = new ProductDetail();
        var product51 = productService.findById(51L);
        var savedProductDetai51 = productDetailService.save(productDetail51);
        var productBlog51 = new ProductBlog(0L, "Đèn ngủ handmade nguyên liệu bao gồm\r\n" + //
                "- 20 bông Hoa Hồng kèm kẽm cành\r\n" + //
                "- Giấy gói\r\n" + //
                "- Set kính tráng gương\r\n" + //
                "- Set đèn led\r\n" + //
                "- Keo và đầy đủ phụ kiện để làm đèn hoàn thiện");
        Image pd51Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-luf0xfbwq6tt51",
                savedProductDetai51);
        Image pd51Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-luf0xfbwq78f57",
                savedProductDetai51);
        Image pd51Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-luf0xfbwszypf1",
                savedProductDetai51);
        Image pd51Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-luf0xfdao65be1",
                savedProductDetai51);
        Image pd51Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-luf0xfbx5nhb9d",
                savedProductDetai51);
        var images51 = List.of(pd51Img1, pd51Img2, pd51Img3, pd51Img4, pd51Img5);
        savedProductDetai51.setImageList(images51);
        savedProductDetai51.setProductBlog(productBlog51);
        savedProductDetai51.setProduct(product51);
        savedProductDetai51.setCategoryList(List.of(c1, c4, c6));
        productDetailService.save(savedProductDetai51);

        // Product detail 52
        ProductDetail productDetail52 = new ProductDetail();
        var product52 = productService.findById(52L);
        var savedProductDetail52 = productDetailService.save(productDetail52);
        var productBlog52 = new ProductBlog(0L,
                "Shop có cây thông noel kẽm nhung sẵn màu như hình hoặc Bạn có thể mua Cây thông đã hoàn thiện hoặc Set nguyên liệu làm cây thông noel về tự làm nha.");
        Image pd52Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lnuwm6fn9x16ca",
                savedProductDetail52);
        Image pd52Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lo9p0esx216ze8",
                savedProductDetail52);
        Image pd52Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lnvlv2jhin3ua0",
                savedProductDetail52);
        Image pd52Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lnvlv2jhk1oa53",
                savedProductDetail52);
        Image pd52Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lo9p0eswxthn90",
                savedProductDetail52);
        var images52 = List.of(pd52Img1, pd52Img2, pd52Img3, pd52Img4, pd52Img5);
        savedProductDetail52.setImageList(images52);
        savedProductDetail52.setProductBlog(productBlog52);
        savedProductDetail52.setProduct(product52);
        savedProductDetail52.setCategoryList(List.of(c1, c6));
        productDetailService.save(savedProductDetail52);

        // Product detail 53
        ProductDetail productDetail53 = new ProductDetail();
        var product53 = productService.findById(53L);
        var savedProductDetail53 = productDetailService.save(productDetail53);
        var productBlog53 = new ProductBlog(0L, "Chất Liệu : Len Milk Cotton \r\n" + //
                "🧵Sản phẩm bao gồm: Len đủ màu, kim móc len, kim khâu len, ghim đánh dấu, keo dán, mắt thú, mũi thú, bông nhồi, chart móc len và qr video hướng dẫn móc len…");
        Image pd53Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lx99z74153o9f9",
                savedProductDetail53);
        Image pd53Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ls2hmzu0xuhl90",
                savedProductDetail53);
        Image pd53Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lx99z7413p3t2f",
                savedProductDetail53);
        Image pd53Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ls2hmzu0v1cpa7",
                savedProductDetail53);
        Image pd53Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ls2hmzu0tms948",
                savedProductDetail53);
        var images53 = List.of(pd53Img1, pd53Img2, pd53Img3, pd53Img4, pd53Img5);
        savedProductDetail53.setImageList(images53);
        savedProductDetail53.setProductBlog(productBlog53);
        savedProductDetail53.setProduct(product53);
        savedProductDetail53.setCategoryList(List.of(c1, c6));
        productDetailService.save(savedProductDetail53);

        ProductDetail productDetail54 = new ProductDetail();
        var product54 = productService.findById(54L);
        var savedProductDetail54 = productDetailService.save(productDetail54);
        var productBlog54 = new ProductBlog(0L, "Thời gian giao hàng dự kiến cho sản phẩm này là từ 7-9 ngày\r\n" + //
                "Đây là món quà của người thêu Trung Quốc đại diện cho tình yêu.");
        Image pd54Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/14c170964c541525c1d66042573bc5df",
                savedProductDetail54);
        Image pd54Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/de93bdc1347b3eabf6459de7158b3a89",
                savedProductDetail54);
        Image pd54Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/baa7b733848ef1c45d5b2fb642d76928",
                savedProductDetail54);
        Image pd54Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/df63d9bdf2d53111aeaf5bf6df934ef9",
                savedProductDetail54);
        Image pd54Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/532b3cad8653ebbb8d5d6a19ae9a17af",
                savedProductDetail54);
        var images54 = List.of(pd54Img1, pd54Img2, pd54Img3, pd54Img4, pd54Img5);
        savedProductDetail54.setImageList(images54);
        savedProductDetail54.setProductBlog(productBlog54);
        savedProductDetail54.setProduct(product54);
        savedProductDetail54.setCategoryList(List.of(c1, c4, c6));
        productDetailService.save(savedProductDetail54);

        // Product detail 55
        ProductDetail productDetail55 = new ProductDetail();
        var product55 = productService.findById(55L);
        var savedProductDetail55 = productDetailService.save(productDetail55);
        var productBlog55 = new ProductBlog(0L,
                "Hôm nay  gửi đến các cậu gói nguyên liệu tự làm cực kỳ mới lạ dành cho các bạn yêu đan móc.Chỉ cần dành khoảng 2h - 5h là đã sở hữu thành phẩm bé thú siêu dễ thương được làm từ chính đôi tay các cậu rồi đấy!");
        Image pd55Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lk3qcf7qbkj800",
                savedProductDetail55);
        Image pd55Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lk3qcf7qedo447",
                savedProductDetail55);
        Image pd55Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lk3qcf7qcz3ofa",
                savedProductDetail55);
        Image pd55Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lk3qcf7qfs8ke4",
                savedProductDetail55);
        Image pd55Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lk3qcf7qh6t0c6",
                savedProductDetail55);
        var images55 = List.of(pd55Img1, pd55Img2, pd55Img3, pd55Img4, pd55Img5);
        savedProductDetail55.setImageList(images55);
        savedProductDetail55.setProductBlog(productBlog55);
        savedProductDetail55.setProduct(product55);
        savedProductDetail55.setCategoryList(List.of(c1, c4, c6));
        productDetailService.save(savedProductDetail55);

        // Product detail 56
        ProductDetail productDetail56 = new ProductDetail();
        var product56 = productService.findById(56L);
        var savedProductDetail56 = productDetailService.save(productDetail56);
        var productBlog56 = new ProductBlog(0L,
                "Set Quà cao cấp Tặng Mẹ Tặng Bạn Gái Quà Tặng Dịp Lễ Tết Sinh Nhật Valentine 8/3 20/10 20/11 LT01");
        Image pd56Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/0ba86cdf6a37256dc2ed22864e83ca8f",
                savedProductDetail56);
        Image pd56Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/0bbe2f04d2078d29ed3d634690695c4f",
                savedProductDetail56);
        Image pd56Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/f3b0c626b47f4da21055e4d1c0532218",
                savedProductDetail56);
        Image pd56Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/11eeb919b0b260e082436053d536bc73",
                savedProductDetail56);
        Image pd56Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/583134f02842ebcdc87bc25a537bd871",
                savedProductDetail56);
        var images56 = List.of(pd56Img1, pd56Img2, pd56Img3, pd56Img4, pd56Img5);
        savedProductDetail56.setImageList(images56);
        savedProductDetail56.setProductBlog(productBlog56);
        savedProductDetail56.setProduct(product56);
        savedProductDetail56.setCategoryList(List.of(c1, c4, c6));
        productDetailService.save(savedProductDetail56);

        // Product detail 57
        ProductDetail productDetail57 = new ProductDetail();
        var product57 = productService.findById(57L);
        var savedProductDetail57 = productDetailService.save(productDetail57);
        var productBlog57 = new ProductBlog(0L, "Hộp giấy decor siêu xinh bởi Staff Caste khéo tay.");
        Image pd57Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lo0vldq8d08q4d",
                savedProductDetail57);
        Image pd57Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lo0vldpxeanu5c",
                savedProductDetail57);
        Image pd57Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lo0vldq7rxq270",
                savedProductDetail57);
        Image pd57Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lo0vldpxear183",
                savedProductDetail57);
        Image pd57Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lo0vldq80d4q71",
                savedProductDetail57);
        var images57 = List.of(pd57Img1, pd57Img2, pd57Img3, pd57Img4, pd57Img5);
        savedProductDetail57.setImageList(images57);
        savedProductDetail57.setProductBlog(productBlog57);
        savedProductDetail57.setProduct(product57);
        savedProductDetail57.setCategoryList(List.of(c1, c4, c6));
        productDetailService.save(savedProductDetail57);

        // Product 58
        ProductDetail productDetail58 = new ProductDetail();
        Product product58 = productService.findById(58L); // Assuming you have a method to find by ID
        ProductDetail savedProductDetail58 = productDetailService.save(productDetail58);
        ProductBlog productBlog58 = new ProductBlog(0L,
                "Set quà tặng hết sức sang trọng và tiện lợi, gồm các sản phẩm không thể thiếu trong cuộc sống như sổ, cốc, muỗng, bình giữ nhiệt, ống hút,...");
        Image pd58Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-luagjof9dc0v17",
                savedProductDetail58);
        Image pd58Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-luagjof9eqlb12",
                savedProductDetail58);
        Image pd58Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-luagjof9g55r05",
                savedProductDetail58);
        Image pd58Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-luagjof9hjq7f4",
                savedProductDetail58);
        Image pd58Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-luagjof9iyane6",
                savedProductDetail58);
        List<Image> images58 = List.of(pd58Img1, pd58Img2, pd58Img3, pd58Img4, pd58Img5);
        savedProductDetail58.setImageList(images58);
        savedProductDetail58.setProductBlog(productBlog58);
        savedProductDetail58.setProduct(product58);
        savedProductDetail58.setCategoryList(List.of(c1, c4)); // Adjust categories as per your database
        productDetailService.save(savedProductDetail58);

        // Product 59
        ProductDetail productDetail59 = new ProductDetail();
        Product product59 = productService.findById(59L); // Assuming you have a method to find by ID
        ProductDetail savedProductDetail59 = productDetailService.save(productDetail59);
        ProductBlog productBlog59 = new ProductBlog(0L,
                "Tranh thêu len độc đáo từ kỹ thuật punch needle, trang trí trong nhà hoặc làm quà tặng đều rất xinh xắn và đậm chất riêng.");
        Image pd59Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lgnj6w2xvk6re5",
                savedProductDetail59);
        Image pd59Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lujdc7zbwmc269",
                savedProductDetail59);
        Image pd59Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lujdc7zby0wi39",
                savedProductDetail59);
        Image pd59Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lxi1g1kbtsyhfe",
                savedProductDetail59);
        Image pd59Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lujdihwmtn2qd0",
                savedProductDetail59);
        List<Image> images59 = List.of(pd59Img1, pd59Img2, pd59Img3, pd59Img4, pd59Img5);
        savedProductDetail59.setImageList(images59);
        savedProductDetail59.setProductBlog(productBlog59);
        savedProductDetail59.setProduct(product59);
        savedProductDetail59.setCategoryList(List.of(c1, c4)); // Adjust categories as per your database
        productDetailService.save(savedProductDetail59);

        // Product 60
        ProductDetail productDetail60 = new ProductDetail();
        Product product60 = productService.findById(60L); // Assuming you have a method to find by ID
        ProductDetail savedProductDetail60 = productDetailService.save(productDetail60);
        ProductBlog productBlog60 = new ProductBlog(0L,
                "Thiệp mở bất ngờ là một cách tuyệt vời để tạo ra một kỷ niệm độc đáo và đáng nhớ cho người đón sinh nhật, ngày kỉ niệm.");
        Image pd60Img1 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lttcoydhi2h970",
                savedProductDetail60);
        Image pd60Img2 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lttcoydhjh1p4c",
                savedProductDetail60);
        Image pd60Img3 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lttcoydhkvm5a9",
                savedProductDetail60);
        Image pd60Img4 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lttcoydhma6l8d",
                savedProductDetail60);
        Image pd60Img5 = new Image(0L, "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lttfixblh4i558",
                savedProductDetail60);
        List<Image> images60 = List.of(pd60Img1, pd60Img2, pd60Img3, pd60Img4, pd60Img5);
        savedProductDetail60.setImageList(images60);
        savedProductDetail60.setProductBlog(productBlog60);
        savedProductDetail60.setProduct(product60);
        savedProductDetail60.setCategoryList(List.of(c1, c4, c5)); // Adjust categories as per your database
        productDetailService.save(savedProductDetail60);

    }

    private void loadCategories() {
        CategoryAddRequest c1 = new CategoryAddRequest("Gift Sets");
        CategoryAddRequest c2 = new CategoryAddRequest("Album");
        CategoryAddRequest c3 = new CategoryAddRequest("Khung hình");
        CategoryAddRequest c4 = new CategoryAddRequest("Quà tặng");
        CategoryAddRequest c5 = new CategoryAddRequest("Thiệp");
        CategoryAddRequest c6 = new CategoryAddRequest("Nguyên liệu");
        categoryService.saveAllCategory(List.of(c1, c2, c3, c4, c5, c6));
    }
}
