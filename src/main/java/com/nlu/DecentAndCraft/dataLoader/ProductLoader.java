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

        Product p1 = new Product(null,
                "Nến thơm Tealight hoa khô DATELIGHTS CANDLE - DATENEYLAND STYLE HÀN QUỐC KÈM HỘP",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lw2e7o8awsez71", 108000, 120000, s3, 100);
        productService.save(p1);
        Product p2 = new Product(null, "Set Quà Tặng Nến Thơm Quà Sinh Nhật Quà Tặng Doanh Nghiệp Quà Tặng Người Yêu",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lvakays3lv1g1f", 629000, 720000, s3, 100);
        productService.save(p2);
        Product p3 = new Product(null, "Hộp Quà Nến Thơm , Set Quà Nến Thơm Handmade Tặng Người Yêu Dịp Noel Gấu Cute",
                "https://down-vn.img.susercontent.com/file/sg-11134201-22110-mxekq7q8jyjv92", 135000, 155000, s3, 100);
        productService.save(p3);
        Product p4 = new Product(null,
                "Set quà tặng cao cấp Bó hoa baby mix hoa hồng sáp sang trọng (kèm túi + đèn led + thiệp)",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-ljc8q09in2s213", 127000, 140000, s3, 100);
        productService.save(p4);
        Product p5 = new Product(null, "Set vật liệu làm bó hoa 520 sao giấy nhiều màu sắc làm quà tặng đẹp S0084",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lri3zb6fh9dw4a", 150000, 170000, s3, 100);
        productService.save(p5);
        Product p6 = new Product(null,
                "Set Quà cao cấp Tặng Mẹ Tặng Bạn Gái Quà Tặng Dịp Lễ Tết Sinh Nhật Valentine 8/3 20/10 20/11 LT01",
                "https://down-vn.img.susercontent.com/file/sg-11134201-7rbni-lnnsfskjnirs67", 120000, 123000, s3, 100);
        productService.save(p6);

        Product p7 = new Product(null, "SET QUÀ TỰ CHỌN SIÊU XINH TIỆM CASTI - NẾN THƠM - SET 02",
                "https://down-vn.img.susercontent.com/file/d31d3b201354bb4978959413891bc04c", 310000, 350000, s3, 100);
        productService.save(p7);

        Product p8 = new Product(null,
                "(Tặng thiệp) Set quà tặng nến thơm và cốc xinh xắn, quà lưu niệm ý nghĩa, độc đáo QT28",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lgd7at3k4hrrc1", 189000, 200000, s3, 100);
        productService.save(p8);

        Product p9 = new Product(null,
                "Túi tự đan handmade, quà tự làm tặng bạn gái ý nghĩa ,đầy đủ nguyên liệu đan túi xách, kèm video hướng dẫn chi tiết A01",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ltvx7hl7ljii04", 150000, 160000, s3, 100);
        productService.save(p9);

        Product p10 = new Product(null,
                "Túi kẹp nách handmade len, túi len thiết kế, túi custom, túi coquette, Quà tặng bạn gái, quà tặng sinh Nhật, BD gift",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwmcgpx1asbd50", 229999, 249000, s3, 100);
        productService.save(p10);
        // Product 11
        Product p11 = new Product(null,
                "Cute Gift Box - bộ quà tặng 6 món với bình giữ nhiệt, khăn quấn tóc nhanh khô, túi nụ thơm, nến thơm handmade",
                "https://down-vn.img.susercontent.com/file/3b0573d6c6514b45e09bf55b5b86106c",
                345000, 365000, s3, 100);
        productService.save(p11);

        // Product 12
        Product p12 = new Product(null,
                "[MOCHI Handmade] Set Tự Làm/Trang Trí Sẵn Khung Ảnh 3D Size 15x15, 20x20 Quà tặng sinh nhật, quà tặng ngày kỉ niệm",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ln6w72qao4z7b9",
                279000, 299000, s3, 100);
        productService.save(p12);

        // Product 13
        Product p13 = new Product(null,
                "[QUÀ TẶNG TÌNH YÊU] Sổ Tình Yêu Be With You, Nhật ký tình yêu, quà tặng cặp đôi ý nghĩa",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lvanjjui25pgfe",
                268000, 288000, s3, 100);
        productService.save(p13);

        // Product 14
        Product p14 = new Product(null, "Album ảnh 6x9, 9x12, 10x15 kiểu bìa da Vintage dán ảnh trực tiếp",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lgdmqr5pw5m2f3",
                15000, 170000, s3, 100);
        productService.save(p14);

        // Product 15
        Product p15 = new Product(null,
                "Shanhai Accordion Album Ảnh Quà Tặng, Gấp Photocard Sách Ảnh Bất Ngờ, Giấy Kraft Sáng Tạo Thủ Công 10 Trang DIY Quà Tặng",
                "https://down-vn.img.susercontent.com/file/sg-11134201-7rd61-lu665ws3p6hf47",
                67000, 87000, s3, 100);
        productService.save(p15);
        // Product 16
        Product p16 = new Product(null,
                "Quà tặng Album ảnh, Sổ Scrapbook Vintage Handmade - Tặng kèm hộp carton bảo vệ Scrapbook",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lti0qpuuqhhm92",
                120000, 140000, s3, 100);
        productService.save(p16);

        // Product 17
        Product p17 = new Product(null,
                "Healmeyou Album Ảnh Sổ Lưu Niệm DIY, Tự Dính 30 Tờ / 60 Trang Album Ảnh Kỷ Niệm, Tranh Kỷ Niệm Bằng Gỗ Handmade Album Tăng",
                "https://down-vn.img.susercontent.com/file/sg-11134201-7rd53-lw4m5nfkbfmv29",
                200000, 220000, s3, 100);
        productService.save(p17);

        // Product 18
        Product p18 = new Product(null,
                "Hộp Album ảnh kỷ niệm lãng mạn thích hợp làm quà tặng/ kỉ niệm/ ngày kỷ niệm",
                "https://down-vn.img.susercontent.com/file/5848b8d5e8f98a4a845aa56ba1dc77f0",
                168000, 188000, s3, 100);
        productService.save(p18);

        // Product 19
        Product p19 = new Product(null,
                "Scrapbook phong thư mini 001, sổ dán ảnh hiệu ứng, quà tặng sinh nhật đáng yêu đựng được tới 43 cái ảnh",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-llaioy0ml58630",
                275000, 295000, s3, 100);
        productService.save(p19);

        // Product 20
        Product p20 = new Product(null,
                "[Album Handmade tình yêu] Remember scrapbook",
                "https://down-vn.img.susercontent.com/file/29ef3ddaaad6662936482a1af77e9a5d",
                640000, 660000, s3, 100);
        productService.save(p20);

        // Product 21
        Product p21 = new Product(null,
                "Sổ dán ảnh Scrapbook - Album ảnh trang trí dùng làm quà tặng",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-loexc1ug55o327",
                392000, 412000, s3, 100);
        productService.save(p21);

        // Product 22
        Product p22 = new Product(null,
                "Thẻ Thông Điệp Phát Nhạc 3d Sáng Tạo Cho Sinh Nhật",
                "https://down-vn.img.susercontent.com/file/dc20e81f4357f5c712a992fffde9ef21",
                40000, 60000, s3, 100);
        productService.save(p22);

        // Product 23
        Product p23 = new Product(null,
                "Album Ảnh 3inch 40 Ngăn In Hình Nhóm Nhạc Kpop Dễ Thương",
                "https://down-vn.img.susercontent.com/file/sg-11134201-7rbl7-lnjjfqcldo35c0",
                66000, 86000, s3, 100);
        productService.save(p23);

        // Product 24
        Product p24 = new Product(null,
                "Hộp quà tặng love box loại 5 ảnh in hình miễn phí tặng sinh nhật anniversay valentine vintage ý nghĩa Góc Nhà gocnha",
                "https://down-vn.img.susercontent.com/file/723e251cd3271577cc914de02255c041",
                110000, 130000, s3, 100);
        productService.save(p24);

        // Product 25
        Product p25 = new Product(null,
                "[Sâu 2 cm] Set làm khung ảnh nổi/Khung ảnh 3D(kèm clip hướng dẫn)",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lqhuy912tkc7db",
                200000, 220000, s3, 100);
        productService.save(p25);

        // Product 26
        Product p26 = new Product(null,
                "(20x30cm) Khung ảnh 3D Scrapframe lưu niệm Handmade Decor phòng - Khung tranh Quà tặng Đa dạng mẫu",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-llti2vt3z9pbae",
                550000, 570000, s3, 100);
        productService.save(p26);

        // Product 27
        Product p27 = new Product(null,
                "[Khung sần sâu 1 cm ]Khung ảnh kỉ niệm/khung ảnh tình yêu/khung ảnh sinh nhật",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lh4x9mccmo8i55",
                165000, 185000, s3, 100);
        productService.save(p27);

        // Product 28
        Product p28 = new Product(null,
                "Khung Ảnh Chữ Viết Tay Vintage Quà Tặng Đặc Biệt - Handmade By NOMAD GARDEN",
                "https://down-vn.img.susercontent.com/file/sg-11134201-22100-tqlamiwlbaiv3b",
                395000, 415000, s3, 100);
        productService.save(p28);

        // Product 29
        Product p29 = new Product(null,
                "Combo khung dây + ảnh treo tường in theo yêu cầu - khung ảnh treo tường gỗ tự nhiên",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lu594ke0ccnzad",
                167000, 187000, s3, 100);
        productService.save(p29);

        // Product 30
        Product p30 = new Product(null,
                "Khung Ảnh Treo Tường, Mặt Kính - Khung Hình Treo Tường Giá Rẻ, Tặng Đinh 3 Chân Không Cần Khoan Tường",
                "https://down-vn.img.susercontent.com/file/99ccdb438389cc67868ec630acb38a67",
                31000, 51000, s3, 100);
        productService.save(p30);
        // Sản phẩm 31
        Product p31 = new Product(null,
                "Khung ảnh gỗ để bàn decor 2 mặt nhiều kích thước, làm gỗ thông tự nhiên trang trí nhà cửa",
                "https://down-vn.img.susercontent.com/file/sg-11134201-23020-1zrnqxckl7mvd7",
                165000, 180000, s3, 90);
        productService.save(p31);

        // Sản phẩm 32
        Product p32 = new Product(null,
                "Khung Ảnh Để Bàn gỗ 3D trong suốt 12*17*4,5cm 1 mặt KA9 Khung Hình mô hình hoa khô đất sét tiêu bản tranh giấy kèm đế",
                "https://down-vn.img.susercontent.com/file/sg-11134201-22100-cambl1qwwuivca",
                60000, 65000, s3, 85);
        productService.save(p32);

        // Sản phẩm 33
        Product p33 = new Product(null,
                "Khung Ảnh Để Bàn Chữ L SÁNG TẠO 2 Mặt Trong Suốt (10x15, 14x21 cm) KA08",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lg66863vjz07e4",
                220000, 240000, s3, 95);
        productService.save(p33);

        // Sản phẩm 34
        Product p34 = new Product(null,
                "[GIÁ XƯỞNG] KHUNG TRANH ẢNH 3D, KHUNG TRANH TRANG TRÍ HOA KHÔ NHIỀU KÍCH THƯỚC",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lm5iltpb8g6707",
                115000, 130000, s3, 88);
        productService.save(p34);

        // Sản phẩm 35
        Product p35 = new Product(null,
                "Thiệp hoa khô, thiệp handmade vintage đen sang trọng dùng decor, quà valentine, 8/3, 20/10, giáng sinh, sinh nhật - T6",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lsh3mjzot7rtee",
                6000, 8000, s3, 92);
        productService.save(p35);

        // Product 36
        Product p36 = new Product(null,
                "Thiệp Quà Tặng Chúc Mừng Họa Tiết Phong Cách Vintage Dễ Thương Cute - Hally shop",
                "https://down-vn.img.susercontent.com/file/sg-11134201-7qvdd-ljgqor3j4u16f1",
                7000, 8000, s3, 100);
        productService.save(p36);

        // Product 37
        Product p37 = new Product(null,
                "Thiệp quà tặng in hình đáng yêu mẫu trái tim.",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lik7yhsj7tg2c7",
                1000, 2000, s3, 100);
        productService.save(p37);

        // Product 38
        Product p38 = new Product(null,
                "Thiệp chúc mừng sinh nhật, ngày lễ ánh nhũ Mua Tất (muatat.shop)",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ls3xwczx5q556e",
                12000, 14000, s3, 100);
        productService.save(p38);

        // Product 39
        Product p39 = new Product(null,
                "Thiệp Chúc Mừng Vintage Cao Cấp LALUNA.CENT - Thư Cảm Ơn Quà Tặng Bạn Bè Người Thân",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-loid9gqa3ylv45",
                5000, 6000, s3, 100);
        productService.save(p39);

        // Product 40
        Product p40 = new Product(null,
                "Thiệp quà tặng Tình yêu \"I love you\" \"To my dear\"",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwe7ae12owrf59",
                4000, 5000, s3, 100);
        productService.save(p40);

        // Product 41
        Product p41 = new Product(null,
                "Thiệp Giấy Gấp Ba Mini Greeting Card Caro Hoạt Hình Hình Nổi Pop Up 3D TTH",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lfe8sw5grq0l4b",
                3500, 3700, s3, 100);
        productService.save(p41);

        // Product 42
        Product p42 = new Product(null,
                "Thiệp sinh nhật, kỷ niệm handmade bó hoa khô ngày tháng tặng kèm bao thư kraft và trái tim",
                "https://down-vn.img.susercontent.com/file/vn-11134211-7r98o-lt0judqi2emx7e",
                35000, 37000, s3, 100);
        productService.save(p42);

        // Product 43
        Product p43 = new Product(null,
                "PVN62594 Thiệp Giấy Thủ Công Phối Hoa Khô Làm Quà Tặng Ngày Của Mẹ -Sinh Nhật - Ngày Lễ Tình Nhân - Quốc tế phụ nữ",
                "https://down-vn.img.susercontent.com/file/vn-11134201-7r98o-lq1y3wlbrxo781",
                3500, 4200, s3, 100);
        productService.save(p43);

        // Product 44
        Product p44 = new Product(null,
                "Thiệp hoa khô handmade Giáng sinh Merry Chrismas, Noen, quà tặng giáng sinh, Noel -M45",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-loo8b8k2gemj2f",
                25000, 28000, s3, 100);
        productService.save(p44);

        // Product 45
        Product p45 = new Product(null,
                "Thiệp kraft handmade sinh nhật/ kỷ niệm bao thư + ruột thiệp tặng kèm hoa khô",
                "https://down-vn.img.susercontent.com/file/vn-11134211-7r98o-lt0judqhzlj85d",
                35000, 39000, s3, 100);
        productService.save(p45);

        // Product 46
        Product p46 = new Product(null,
                "Đồ Handmade Tự Làm, Đèn Ngủ Hoa Tulip, Set Tự Làm Đèn Hoa Tulip Tráng Gương, Làm Quà Tặng",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwy67ac6tqs9db", 180000, 190000, s3, 100);
        productService.save(p46);

        // Product 47
        Product p47 = new Product(null,
                "[TỰ LÀM - LÀM SẴN] DIY Đèn Tulip hình ĐÁM MÂY GƯƠNG Handmade Trang Trí, Quà Tặng Sinh Nhật Đèn ngủ, làm gương - Erashop",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-luyyoomeaotha2", 209000, 250000, s3, 100);
        productService.save(p47);

        // Product 48
        Product p48 = new Product(null,
                "[TỰ LÀM-LÀM SẴN] Đèn hoa TULIP TRÒN handmade, đèn hoa tulip sang trọng quà tặng người yêu Valentine, sinh nhật",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ltcp8fyc9gnt68", 215000, 230000, s3, 100);
        productService.save(p48);

        // Product 49
        Product p49 = new Product(null,
                "DIY Set tự làm Bó hoa hình Bướm phát sáng 🦋 handmade full phụ kiện quà tặng sinh nhật bạn gái, người yêu",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ls33ptqrlhvo88", 195000, 205000, s3, 100);
        productService.save(p49);

        // Product 50
        Product p50 = new Product(null,
                "[CÓ SẴN/HCM] DIY - Set Nguyên liệu móc BẠCH TUỘC làm móc khóa - Nhiều màu, kèm hướng dẫn chi tiết",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lihb6q75zhea54", 40000, 47000, s3, 100);
        productService.save(p50);

        // Product 51
        Product p51 = new Product(null,
                "[DIY] SET TỰ LÀM Hộp Đèn Bó Hoa Hồng khung vuông tráng gương handmade làm quà tặng sinh nhật, valentine",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-luf0xfbwq6tt51",
                200000, 200000, s3, 100);
        productService.save(p51);

        // Product 52
        Product p52 = new Product(null,
                "[Full phụ kiện - Có sẵn] Cây Thông Noel Kẽm Nhung / Set Nguyên Liệu Tự làm Cây Thông Noel Handmade Mini 22cm Era Shop",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lnuwm6fn9x16ca",
                74000, 74000, s3, 100);
        productService.save(p52);

        // Product 53
        Product p53 = new Product(null,
                "[DIY] Set nguyên liệu móc Len Thú bông cầm tay, Đồ thủ công handmade tặng chart móc len và video hướng dẫn cho người mới",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lx99z74153o9f9",
                135000, 135000, s3, 100);
        productService.save(p53);

        // Product 54
        Product p54 = new Product(null,
                "Bộ đồ thêu tay mặt dây chuyền tự làm hình tròn/ Vuông thủ công/Quà tặng đại diện tình yêu",
                "https://down-vn.img.susercontent.com/file/14c170964c541525c1d66042573bc5df",
                78000, 78000, s3, 100);
        productService.save(p54);

        // Product 55
        Product p55 = new Product(null,
                "DIY Gói Nguyên Liệu Tự Móc Len Gấu Teddy Dễ Thương Quà Tặng Handmade- Lễ tình nhân",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lk3qcf7qbkj800",
                95000, 95000, s3, 100);
        productService.save(p55);

        // Product 56
        Product p56 = new Product(null,
                "Set nguyên liệu thêu bùa hộ mệnh làm phụ kiện cho ví/ túi may mắn an toàn trên xe hơi DIY",
                "https://down-vn.img.susercontent.com/file/0ba86cdf6a37256dc2ed22864e83ca8f",
                125000, 125000, s3, 100);
        productService.save(p56);

        // Product 57
        Product p57 = new Product(null,
                "Bộ nguyên liệu tự làm Mèo bông xinh xắn bằng thêu len nổi - Punch Needle Tiệm tạp hoá Nhà May",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lo0vldq8d08q4d",
                78000, 78000, s3, 100);
        productService.save(p57);

                // Product 58
                Product p58 = new Product(null,
                "Set quà sinh nhật ý nghĩa cho cả nam & nữ - Combo quà tặng sổ gỗ, cốc tre, ống hút (Khắc hình & chữ theo yêu cầu)",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-luagjof9dc0v17",
                329000, 349000, s3, 100);
        productService.save(p58);

        // Product 59
        Product p59 = new Product(null,
                "Tranh thêu len nổi, thêu xù thêu nổi punch needle khung gỗ trang trí tường, làm quà tặng",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-lgnj6w2xvk6re5",
                445000, 465000, s3, 100);
        productService.save(p59);

        // Product 57
        Product p60 = new Product(null,
                "Thiệp handmade đặc biệt ( đã kèm ảnh), thiệp tặng quà xinh xắn tạo bất ngờ cho người nhận, Harumi Gifts Box",
                "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lttcoydhi2h970",
                139000, 159000, s3, 100);
        productService.save(p60);

    }
}
