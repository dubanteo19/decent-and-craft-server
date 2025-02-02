package com.nlu.DecentAndCraft.dataLoader;

import com.nlu.DecentAndCraft.model.Blog;
import com.nlu.DecentAndCraft.model.BlogCategory;
import com.nlu.DecentAndCraft.repository.BlogCategoryRepository;
import com.nlu.DecentAndCraft.service.BlogService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(3)
public class BlogLoader implements CommandLineRunner {
    private final BlogService blogService;
    private final BlogCategoryRepository blogCategoryRepository;
    @Value("${include-data-loader}")
    boolean includeDataLoader;

    public BlogLoader(BlogService blogService, BlogCategoryRepository blogCategoryRepository) {
        this.blogService = blogService;
        this.blogCategoryRepository = blogCategoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (!includeDataLoader) {
            return;
        }
        saveBlogcategories();
        Blog blog1 = getBlog1();
        Blog blog2 = getBlog2();
        Blog blog3 = getBlog3();
        Blog blog4 = getBlog4();
        var blogc1 = blogCategoryRepository.findById(1L).get();
        var blogc2 = blogCategoryRepository.findById(2L).get();
        var blogc3 = blogCategoryRepository.findById(3L).get();
        var blogc4 = blogCategoryRepository.findById(4L).get();
        blog1.setCategories(List.of(blogc1, blogc2));
        blog2.setCategories(List.of(blogc2, blogc3));
        blog3.setCategories(List.of(blogc1, blogc4));
        blog4.setCategories(List.of(blogc2, blogc1));
        blogService.save(blog1);
        blogService.save(blog2);
        blogService.save(blog3);
        blogService.save(blog4);
    }


    private Blog getBlog4() {
        return Blog
                .builder()
                .title("Những sản phẩm thủ công bằng giấy sáng tạo cho trang trí nhà cửa")
                .author("Liêu Thị Diễm Quỳnh")
                .header("Trang trí nhà cửa là một nghệ thuật, và việc sử dụng sản phẩm thủ công từ giấy có thể làm cho không gian sống của bạn trở nên sống động và độc đáo hơn bao giờ hết. Từ những chiếc hoa giấy tinh tế đến những bức tranh quilling đầy màu sắc")
                .thumbnail("https://fairycorner.vn/wp-content/uploads/2015/05/Fairy-Corner-Trang-tri-dam-cuoi-handmade-11.jpg")
                .content(
                        """
                                Sản phẩm này rất tốt nha 
                                """)
                .build();
    }

    private Blog getBlog3() {
        return Blog
                .builder()
                .title("Những sản phẩm thủ công bằng giấy sáng tạo cho trang trí nhà cửa")
                .author("Liêu Thị Diễm Quỳnh")
                .header("Trang trí nhà cửa là một nghệ thuật, và việc sử dụng sản phẩm thủ công từ giấy có thể làm cho không gian sống của bạn trở nên sống động và độc đáo hơn bao giờ hết. Từ những chiếc hoa giấy tinh tế đến những bức tranh quilling đầy màu sắc")
                .thumbnail("https://fairycorner.vn/wp-content/uploads/2015/05/Fairy-Corner-Trang-tri-dam-cuoi-handmade-11.jpg")
                .content(
                        """
                                Sản phẩm này rất tốt nha 
                                """)
                .build();
    }

    private Blog getBlog2() {

        return Blog
                .builder()
                .title("6 ý tưởng để Scrapbooking với Washi Tape ( Băng keo trang trí )")
                .author("Chúc Ngân")
                .header("Trong bài viết này, chúng tôi sẽ chia sẻ với bạn sáu ý tưởng sáng tạo để sử dụng washi tape trong scrapbooking. Tận dụng sức mạnh của băng keo trang trí này, bạn có thể tạo ra những trang scrapbook độc đáo và thú vị")
                .thumbnail("https://fairycorner.vn/wp-content/uploads/2016/11/IMG_11762588.jpg")
                .content(
                        """
                                                        <h2 style=\"-webkit-text-stroke-width:0px;background-color:rgb(255, 255, 255);box-sizing:border-box;color:rgb(54, 54, 54);font-family:Quicksand, sans-serif;font-size:2em;font-style:normal;font-variant-caps:normal;font-variant-ligatures:normal;font-weight:400;letter-spacing:0.01em;line-height:1.4;margin-bottom:10px;margin-top:0px;orphans:2;text-align:start;text-decoration-color:initial;text-decoration-style:initial;text-decoration-thickness:initial;text-indent:0px;text-transform:none;white-space:normal;widows:2;word-spacing:0px;\">Len nhung gấu</h2>\n" +
                                "<p style=\"-webkit-text-stroke-width:0px;background-color:rgb(255, 255, 255);box-sizing:border-box;color:rgb(54, 54, 54);font-family:gothamvnu-book;font-size:14px;font-style:normal;font-variant-caps:normal;font-variant-ligatures:normal;font-weight:400;letter-spacing:normal;margin:0px 0px 10px;orphans:2;text-align:start;text-decoration-color:initial;text-decoration-style:initial;text-decoration-thickness:initial;text-indent:0px;text-transform:none;white-space:normal;widows:2;word-spacing:0px;\"><em style=\"box-sizing:border-box;\"><i><strong style=\"box-sizing:border-box;\">Len nhung gấu&nbsp;</strong></i></em>là dòng len nội địa Trung mềm mịn, ấm áp. Không hề rụng lông khi đan và móc. Sở dĩ len có tên là len nhung gấu vì mác cuộn len có hình con gấu xinh xắn. Và dòng len này cũng được rất nhiều chị em sử dụng để đan móc thú bông, gấu bông. Ngoài ra len nhung gấu có thể đan áo cho bé, móc váy, khăn, mũ, chăn....đồ trang trí như gối sofa. Đây đúng là dòng len siêu phẩm trong thế giới handmade.</p>\n" +
                                "<p style=\"-webkit-text-stroke-width:0px;background-color:rgb(255, 255, 255);box-sizing:border-box;color:rgb(54, 54, 54);font-family:gothamvnu-book;font-size:14px;font-style:normal;font-variant-caps:normal;font-variant-ligatures:normal;font-weight:400;letter-spacing:normal;margin:0px 0px 10px;orphans:2;text-align:start;text-decoration-color:initial;text-decoration-style:initial;text-decoration-thickness:initial;text-indent:0px;text-transform:none;white-space:normal;widows:2;word-spacing:0px;\">Bảng màu len có tất cả 46 mã màu rất đẹp chạy từ 01-46. Mỗi tông màu đậm nhạt khác nhau rất phong phú.</p>\n" +
                                "<p style=\"-webkit-text-stroke-width:0px;background-color:rgb(255, 255, 255);box-sizing:border-box;color:rgb(54, 54, 54);font-family:gothamvnu-book;font-size:14px;font-style:normal;font-variant-caps:normal;font-variant-ligatures:normal;font-weight:400;letter-spacing:normal;margin:0px 0px 10px;orphans:2;text-align:start;text-decoration-color:initial;text-decoration-style:initial;text-decoration-thickness:initial;text-indent:0px;text-transform:none;white-space:normal;widows:2;word-spacing:0px;\">Kích thước len sợi: khoảng 2.5mm-3.0mm</p>\n" +
                                "<p style=\"-webkit-text-stroke-width:0px;background-color:rgb(255, 255, 255);box-sizing:border-box;color:rgb(54, 54, 54);font-family:gothamvnu-book;font-size:14px;font-style:normal;font-variant-caps:normal;font-variant-ligatures:normal;font-weight:400;letter-spacing:normal;margin:0px 0px 10px;orphans:2;text-align:start;text-decoration-color:initial;text-decoration-style:initial;text-decoration-thickness:initial;text-indent:0px;text-transform:none;white-space:normal;widows:2;word-spacing:0px;\">Kim móc: 2.5mm-3.0mm cho móc thú len, 3.0mm-4.0mm cho móc khăn&nbsp;váy áo</p>\n" +
                                "<p style=\"-webkit-text-stroke-width:0px;background-color:rgb(255, 255, 255);box-sizing:border-box;color:rgb(54, 54, 54);font-family:gothamvnu-book;font-size:14px;font-style:normal;font-variant-caps:normal;font-variant-ligatures:normal;font-weight:400;letter-spacing:normal;margin:0px 0px 10px;orphans:2;text-align:start;text-decoration-color:initial;text-decoration-style:initial;text-decoration-thickness:initial;text-indent:0px;text-transform:none;white-space:normal;widows:2;word-spacing:0px;\">Kim đan: 4.0mm-5.0mm</p>\n" +
                                "<p style=\"-webkit-text-stroke-width:0px;background-color:rgb(255, 255, 255);box-sizing:border-box;color:rgb(54, 54, 54);font-family:gothamvnu-book;font-size:14px;font-style:normal;font-variant-caps:normal;font-variant-ligatures:normal;font-weight:400;letter-spacing:normal;margin:0px 0px 10px;orphans:2;text-align:start;text-decoration-color:initial;text-decoration-style:initial;text-decoration-thickness:initial;text-indent:0px;text-transform:none;white-space:normal;widows:2;word-spacing:0px;\"><strong>- Trọng lượng sản phẩm: 50g</strong></p>\n" +
                                "<p style=\"-webkit-text-stroke-width:0px;background-color:rgb(255, 255, 255);box-sizing:border-box;color:rgb(54, 54, 54);font-family:gothamvnu-book;font-size:14px;font-style:normal;font-variant-caps:normal;font-variant-ligatures:normal;font-weight:400;letter-spacing:normal;margin:0px 0px 10px;orphans:2;text-align:start;text-decoration-color:initial;text-decoration-style:initial;text-decoration-thickness:initial;text-indent:0px;text-transform:none;white-space:normal;widows:2;word-spacing:0px;\">- Thành phần: 100% Polyester</p>\n" +
                                "<p style=\"-webkit-text-stroke-width:0px;background-color:rgb(255, 255, 255);box-sizing:border-box;color:rgb(54, 54, 54);font-family:gothamvnu-book;font-size:14px;font-style:normal;font-variant-caps:normal;font-variant-ligatures:normal;font-weight:400;letter-spacing:normal;margin:0px 0px 10px;orphans:2;text-align:start;text-decoration-color:initial;text-decoration-style:initial;text-decoration-thickness:initial;text-indent:0px;text-transform:none;white-space:normal;widows:2;word-spacing:0px;\">- Chiều dài cuộn: 135 mét</p>\n" +
                                "<p style=\"-webkit-text-stroke-width:0px;background-color:rgb(255, 255, 255);box-sizing:border-box;color:rgb(54, 54, 54);font-family:gothamvnu-book;font-size:14px;font-style:normal;font-variant-caps:normal;font-variant-ligatures:normal;font-weight:400;letter-spacing:normal;margin:0px 0px 10px;orphans:2;text-align:start;text-decoration-color:initial;text-decoration-style:initial;text-decoration-thickness:initial;text-indent:0px;text-transform:none;white-space:normal;widows:2;word-spacing:0px;\">- Khách sỉ vui lòng inbox&nbsp;</p>\n" +
                                "<p style=\"-webkit-text-stroke-width:0px;background-color:rgb(255, 255, 255);box-sizing:border-box;color:rgb(54, 54, 54);font-family:gothamvnu-book;font-size:14px;font-style:normal;font-variant-caps:normal;font-variant-ligatures:normal;font-weight:400;letter-spacing:normal;margin:0px 0px 10px;orphans:2;text-align:start;text-decoration-color:initial;text-decoration-style:initial;text-decoration-thickness:initial;text-indent:0px;text-transform:none;white-space:normal;widows:2;word-spacing:0px;\">#lennhunggau #len&nbsp;#lennhung #lensoidanmoc #lensoi #lensoidanmocnoli</p>\n" +
                                "<p style=\"-webkit-text-stroke-width:0px;background-color:rgb(255, 255, 255);box-sizing:border-box;color:rgb(54, 54, 54);font-family:gothamvnu-book;font-size:14px;font-style:normal;font-variant-caps:normal;font-variant-ligatures:normal;font-weight:400;letter-spacing:normal;margin:0px 0px 10px;orphans:2;text-align:start;text-decoration-color:initial;text-decoration-style:initial;text-decoration-thickness:initial;text-indent:0px;text-transform:none;white-space:normal;widows:2;word-spacing:0px;\"><strong style=\"box-sizing:border-box;\">LƯU&nbsp;Ý KHÔNG THỂ BỎ QUA:</strong>&nbsp;Màu sắc của bảng màu có thể sẽ đậm hoặc nhạt hơn màu thật bên ngoài 1 chút, do hiển thị tại&nbsp;mỗi thiết bị xem&nbsp;là khác nhau, nhưng sẽ không khác tông nên không ảnh hưởng nhiều.</p>\n" +
                                "<p style=\"-webkit-text-stroke-width:0px;background-color:rgb(255, 255, 255);box-sizing:border-box;color:rgb(54, 54, 54);font-family:gothamvnu-book;font-size:14px;font-style:normal;font-variant-caps:normal;font-variant-ligatures:normal;font-weight:400;letter-spacing:normal;margin:0px 0px 10px;orphans:2;text-align:start;text-decoration-color:initial;text-decoration-style:initial;text-decoration-thickness:initial;text-indent:0px;text-transform:none;white-space:normal;widows:2;word-spacing:0px;\">Màu sắc len sợi&nbsp;giữa các lô hàng có thể sẽ bị chênh&nbsp;1 chút do nhà sản xuất nhuộm màu&nbsp;tùy vào số lot của lô đó. Các bạn mua hàng&nbsp;nên chọn đủ hoặc dư 1,2 cuộn&nbsp;để làm. Hoặc giữ lại mác và 1 chút len mẫu&nbsp;để shop kiểm tra tồn kho&nbsp;bằng số lot thay vì mã màu nhé.</p>\n" +
                                "<p style=\"-webkit-text-stroke-width:0px;background-color:rgb(255, 255, 255);box-sizing:border-box;color:rgb(54, 54, 54);font-family:gothamvnu-book;font-size:14px;font-style:normal;font-variant-caps:normal;font-variant-ligatures:normal;font-weight:400;letter-spacing:normal;margin:0px 0px 10px;orphans:2;text-align:start;text-decoration-color:initial;text-decoration-style:initial;text-decoration-thickness:initial;text-indent:0px;text-transform:none;white-space:normal;widows:2;word-spacing:0px;\"><img style=\"border-style:none;border-width:0px;box-sizing:border-box;height:auto !important;margin:0px;max-width:100%;vertical-align:middle;\" src=\"https://bizweb.dktcdn.net/100/348/234/files/img-8555.jpg?v=1717418682142\" data-thumb=\"original\" original-height=\"800\" original-width=\"800\" width=\"800\" height=\"800\"></p>
                                                    """)
                .build();

    }

    private Blog getBlog1() {
        return Blog
                .builder()
                .title("Ý tưởng làm khung hình scrapbook sáng tạo")
                .author("Du Ban Teo")
                .header("Mỗi chiếc muỗng trong bộ sưu tập này không chỉ là sản phẩm trang trí, mà còn là một tác phẩm nghệ thuật tinh tế. Chúng là điểm nhấn hoàn hảo cho mọi góc nhỏ trong ngôi nhà của bạn, tạo ra một không gian lễ hội ấm áp và phong phú.")
                .thumbnail("https://bizweb.dktcdn.net/100/427/928/files/huong-dan-cach-lam-scrapbook-album-anh-handmade-don-gian-dep-vintage.jpg?v=1648194655991")
                .content(
                        """
                                        <h2 style="margin - left:0 px;
                                        ">0. Set Muỗng Merry Christmas - Cau Hai Homedecor</h3>
                                                < p style = "margin-left:-1px;" > Nếu bạn đang tìm kiếm sự khác biệt trong việc trang trí không gian lễ
                                        hội của mình, thì & nbsp;
                                        set muỗng của Cau Hai Homedecor&nbsp;
                                        là lựa chọn độc đáo và tràn ngập ý nghĩa.Mỗi chiếc muỗng trong bộ sưu tập này không chỉ là sản phẩm trang trí mà
                                        còn là tác phẩm nghệ thuật tinh tế, mang đến không khí lễ hội đặc biệt cho mỗi góc nhỏ trong ngôi nhà của bạn.</
                                        p >
                                <p style = "margin-left:-1px;" > Set Muỗng Merry Christmas không chỉ là những chiếc muỗng thông thường.Chúng là sự kết
                                        hợp của nghệ thuật trang trí và chất lượng vững vàng, làm cho chúng trở thành những nguồn cảm hứng không ngừng
                                        cho không gian sống của bạn.</p >
                                <p style = "margin-left:-1px;" > Chất liệu an toàn và bền bỉ là những điểm mạnh của Set Muỗng Merry Christmas, giúp
                                        chúng không chỉ làm đẹp không gian sống mà còn trở thành những vật dụng tiện ích trong mọi bữa tiệc mừng
                                        lễ.Bạn có thể yên tâm sử dụng chúng không chỉ để trang trí bàn ăn mà còn để tạo nên không khí ấm áp và tươi
                                        mới cho mỗi buổi họp mặt.</p >
                                <p style = "margin-left:-1px;" > Set Muỗng Merry Christmas không chỉ đơn thuần là sự kết hợp của các chiếc muỗng, mà
                                        còn là sự hòa quyện giữa chất lượng và thiết kế độc đáo.Với sự chăm sóc kỹ lưỡng từng chi tiết, bộ sưu tập
                                        này không chỉ làm tăng vẻ đẹp độc đáo mà còn mang lại cảm giác ấn tượng và tinh tế cho không gian sống của bạn.</
                                        p >
                                <p style = "margin-left:-1px;" > Hãy để chúng mình dẫn bạn khám phá sự độc đáo và phong cách mà set muỗng này mang
                                        lại cho không gian sống của bạn, tạo nên không khí lễ hội tuyệt vời nhất với đồ trang trí Noel tinh tế.< / p >
                                <p style = "margin-left:-1px;" ><strong > Địa chỉ:</strong > & nbsp; 166 Ngô Gia Tự, P .9, Q .10, TP.HCM </p >
                                <p style = "margin-left:-1px;" ><strong > Website:</strong > & nbsp; https:
                                //cauhaihomedecor.vn/</p>
                                <p style = "margin-left:-1px;" ><strong > Điện thoại:&nbsp;</strong > 0383796880 - 0383442239 </p >
                                <p style = "margin-left:-1px;" ><
                                        img src = "https://images.twinkl.co.uk/tw0n/image/private/t_630_eco/website/uploaded/img-3400-min-jpeg-1702695517.jpg"
                                        alt = "img 3399-min-jpeg" width = "630" ></p >
                                <h2 style = "margin-left:0px;" > 2. Nến Thơm Giáng Sinh -First Sight </h3 >
                                <p style = "margin-left:-1px;" > Nến Thơm Giáng Sinh của nhà First Sight & nbsp;
                                        là một món đồ trang trí Noel tinh tế và ý nghĩa, tạo nên không gian lễ hội đầy ấm áp và phong cách trong
                                        mỗi ngôi nhà.Với thiết kế màu sắc tươi mới và hoạ tiết hân hoan, nến không chỉ là nguồn ánh sáng ấm áp mà còn
                                        là điểm nhấn độc đáo cho không gian sống.< / p >
                                <p style = "margin-left:-1px;" > Mỗi chiếc nến mang trong mình hương thơm tinh tế, lấy cảm hứng từ không khí trong
                                        trẻo và se se lạnh của mùa đông.Nến thơm giáng sinh của First Sight có 2 mùi:
                                        First Snowfall, Woody Musky, và Oceania.< / p >
                                <p style = "margin-left:-1px;" > Đặt chiếc nến này trên bàn ăn, bàn làm việc, hoặc bất kỳ góc nào của ngôi nhà, bạn
                                        sẽ cảm nhận được không khí ấm áp và tràn ngập hương thơm mỗi khi nến cháy.Tự thưởng bản thân mình bằng một chút
                                        ấm áp hương thơm, cạnh chương trình tivi ưa thích và chăn ấm quấn quanh, là cách tuyệt vời để tận hưởng
                                        không khí đặc biệt của mùa đông, khiến cho mùa Giáng Sinh trở nên trọn vẹn và ý nghĩa hơn bao giờ hết.< / p >
                                <p style = "margin-left:-1px;" ><strong > Địa chỉ:&nbsp;</strong > 33 Hoa Sứ, phường 7, Phú Nhuận </p >
                                <p style = "margin-left:-1px;" ><strong > Website:&nbsp;</strong > https://firstsight.vn/</p>
                                <p style = "margin-left:-1px;" > Điện thoại:&nbsp;
                                        086 898 0099 –070 893 8782 </p >
                                <p style = "margin-left:-1px;" ><
                                        img src = "https://images.twinkl.co.uk/tw0n/image/private/t_630_eco/website/uploaded/vn-11134208-7r98o-lof69m1hs69j43-1702695517.jpg"
                                        alt = "vn 11134207-7r98o-lof69m1hs69j43" width = "630" ></p >
                                <h2 style = "margin-left:0px;" ><strong > 3. Túi Gấu Thỏ Mặt Cầu - Hoa Tay Handmade</strong ></h3 >
                                <p style = "margin-left:-1px;" > Chào đón không khí Noel,&nbsp;
                                        Túi Gấu Thỏ Mặt Cầu của Hoa Tay Handmade & nbsp;
                                        là một điểm nhấn độc đáo trong bộ sưu tập đồ trang trí Noel của bạn.Được tạo nên từ sự kết hợp tinh tế giữa
                                        mica hình cầu và mica trơn, chiếc túi này không chỉ là một món đồ trang trí Noel độc đáo mà còn là biểu tượng
                                        của tình yêu thủ công và sự tôn trọng đối với vật liệu tái chế.< / p >
                                <p style = "margin-left:-1px;" > Sợi vải Tshirt Yarn được sử dụng khéo léo, tạo nên đường nét mềm mại và ấm áp của Gấu
                                        Thỏ, một người bạn đáng yêu và dễ thương trong không khí lễ hội.Sự chắc chắn của dây xích có khoá càng cua 1
                                        đầu và khoen D tạo nên tính thực tế, giúp chiếc túi không chỉ trang trí mà còn tiện ích trong việc sử dụng
                                        hàng ngày.</p >
                                <p style = "margin-left:-1px;" > Bằng bàn tay khéo léo với kim may len nhựa và kim đánh dấu chuyên dụng, chiếc túi Gấu
                                        Thỏ Mặt Cầu không chỉ là một sản phẩm trang trí nghệ thuật mà còn là biểu tượng của sự sáng tạo và lòng
                                        nhiệt huyết thủ công.</p >
                                <p style = "margin-left:-1px;" > Để làm cho chiếc túi trở nên phong cách và thu hút, không thể thiếu những chi tiết trang
                                        trí như nơ và ren vintage.Những điểm nhấn này không chỉ làm cho chiếc túi nổi bật trong không gian lễ hội mà
                                        còn tôn lên vẻ độc đáo và cá tính của nó.< / p >
                                <p style = "margin-left:-1px;" > Với Túi Gấu Thỏ Mặt Cầu, không chỉ là việc trang trí noel, mà là việc tạo nên một không
                                        gian ấm áp, đẹp mắt và sáng tạo trong mỗi góc nhỏ của ngôi nhà bạn.Hãy để tác phẩm thủ công này làm cho mùa
                                        lễ hội của bạn trở nên đặc biệt và ý nghĩa hơn bao giờ hết.< / p >
                                <p style = "margin-left:-1px;" ><strong > Địa chỉ:</strong > & nbsp; 2 / 21 Đường số 7, Cư Xá Đô Thành, p .4, Quận 3. </
                                        p >
                                <p style = "margin-left:-1px;" ><strong > Website:</strong > & nbsp; https:
                                //hoatay.vn/</p>
                                <p style = "margin-left:-1px;" > Điện thoại:&nbsp;
                                        0908187388 - 0938204488 </p >
                                <p style = "margin-left:-1px;" ><
                                        img src = "https://images.twinkl.co.uk/tw0n/image/private/t_630_eco/website/uploaded/screenshot-2023-12-16-095737-1702695516.png"
                                        alt = "Screenshot 2022 12-16 095737" width = "630" ></p >
                                """)
                .build();
    }

    private void saveBlogcategories() {
        BlogCategory blogCategor1 = new BlogCategory();
        BlogCategory blogCategor2 = new BlogCategory();
        BlogCategory blogCategor3 = new BlogCategory();
        BlogCategory blogCategor4 = new BlogCategory();
        blogCategor1.setName("HƯỚNG DẪN");
        blogCategor2.setName("IEADS");
        blogCategor3.setName("DIY");
        blogCategor4.setName("THỦ CÔNG");
        blogCategoryRepository.saveAll(List.of(blogCategor1, blogCategor2, blogCategor3, blogCategor4));
    }
}
