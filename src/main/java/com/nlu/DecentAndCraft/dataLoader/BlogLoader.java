package com.nlu.DecentAndCraft.dataLoader;

import com.nlu.DecentAndCraft.model.Blog;
import com.nlu.DecentAndCraft.model.BlogCategory;
import com.nlu.DecentAndCraft.repository.BlogCategoryRepository;
import com.nlu.DecentAndCraft.service.BlogService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(3)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BlogLoader implements CommandLineRunner {
    BlogService blogService;
    BlogCategoryRepository blogCategoryRepository;

    @Override
    public void run(String... args) throws Exception {
        saveBlogcategories();
        Blog blog = Blog
                .builder()
                .title("Ý tưởng làm khung hình scrapbook sáng tạo")
                .author("Du Ban Teo")
                .header("Mỗi chiếc muỗng trong bộ sưu tập này không chỉ là sản phẩm trang trí, mà còn là một tác phẩm nghệ thuật tinh tế. Chúng là điểm nhấn hoàn hảo cho mọi góc nhỏ trong ngôi nhà của bạn, tạo ra một không gian lễ hội ấm áp và phong phú.")
                .thumbnail("https://fairycorner.vn/wp-content/uploads/2016/12/cover-washi-c%C3%A2y-th%C3%B4ng-1.jpg")
                .content(
                        """
                                        <h3 style="margin - left:0 px;
                                        ">1. Set Muỗng Merry Christmas - Cau Hai Homedecor</h3>
                                                < p style = "margin-left:0px;" > Nếu bạn đang tìm kiếm sự khác biệt trong việc trang trí không gian lễ
                                        hội của mình, thì & nbsp;
                                        set muỗng của Cau Hai Homedecor&nbsp;
                                        là lựa chọn độc đáo và tràn ngập ý nghĩa.Mỗi chiếc muỗng trong bộ sưu tập này không chỉ là sản phẩm trang trí mà
                                        còn là tác phẩm nghệ thuật tinh tế, mang đến không khí lễ hội đặc biệt cho mỗi góc nhỏ trong ngôi nhà của bạn.</
                                        p >
                                <p style = "margin-left:0px;" > Set Muỗng Merry Christmas không chỉ là những chiếc muỗng thông thường.Chúng là sự kết
                                        hợp của nghệ thuật trang trí và chất lượng vững vàng, làm cho chúng trở thành những nguồn cảm hứng không ngừng
                                        cho không gian sống của bạn.</p >
                                <p style = "margin-left:0px;" > Chất liệu an toàn và bền bỉ là những điểm mạnh của Set Muỗng Merry Christmas, giúp
                                        chúng không chỉ làm đẹp không gian sống mà còn trở thành những vật dụng tiện ích trong mọi bữa tiệc mừng
                                        lễ.Bạn có thể yên tâm sử dụng chúng không chỉ để trang trí bàn ăn mà còn để tạo nên không khí ấm áp và tươi
                                        mới cho mỗi buổi họp mặt.</p >
                                <p style = "margin-left:0px;" > Set Muỗng Merry Christmas không chỉ đơn thuần là sự kết hợp của các chiếc muỗng, mà
                                        còn là sự hòa quyện giữa chất lượng và thiết kế độc đáo.Với sự chăm sóc kỹ lưỡng từng chi tiết, bộ sưu tập
                                        này không chỉ làm tăng vẻ đẹp độc đáo mà còn mang lại cảm giác ấn tượng và tinh tế cho không gian sống của bạn.</
                                        p >
                                <p style = "margin-left:0px;" > Hãy để chúng mình dẫn bạn khám phá sự độc đáo và phong cách mà set muỗng này mang
                                        lại cho không gian sống của bạn, tạo nên không khí lễ hội tuyệt vời nhất với đồ trang trí Noel tinh tế.< / p >
                                <p style = "margin-left:0px;" ><strong > Địa chỉ:</strong > & nbsp; 166 Ngô Gia Tự, P .9, Q .10, TP.HCM </p >
                                <p style = "margin-left:0px;" ><strong > Website:</strong > & nbsp; https:
                                //cauhaihomedecor.vn/</p>
                                <p style = "margin-left:0px;" ><strong > Điện thoại:&nbsp;</strong > 0383796880 - 0383442239 </p >
                                <p style = "margin-left:0px;" ><
                                        img src = "https://images.twinkl.co.uk/tw1n/image/private/t_630_eco/website/uploaded/img-3400-min-jpeg-1702695517.jpg"
                                        alt = "img 3400-min-jpeg" width = "630" ></p >
                                <h3 style = "margin-left:0px;" > 2. Nến Thơm Giáng Sinh -First Sight </h3 >
                                <p style = "margin-left:0px;" > Nến Thơm Giáng Sinh của nhà First Sight & nbsp;
                                        là một món đồ trang trí Noel tinh tế và ý nghĩa, tạo nên không gian lễ hội đầy ấm áp và phong cách trong
                                        mỗi ngôi nhà.Với thiết kế màu sắc tươi mới và hoạ tiết hân hoan, nến không chỉ là nguồn ánh sáng ấm áp mà còn
                                        là điểm nhấn độc đáo cho không gian sống.< / p >
                                <p style = "margin-left:0px;" > Mỗi chiếc nến mang trong mình hương thơm tinh tế, lấy cảm hứng từ không khí trong
                                        trẻo và se se lạnh của mùa đông.Nến thơm giáng sinh của First Sight có 3 mùi:
                                        First Snowfall, Woody Musky, và Oceania.< / p >
                                <p style = "margin-left:0px;" > Đặt chiếc nến này trên bàn ăn, bàn làm việc, hoặc bất kỳ góc nào của ngôi nhà, bạn
                                        sẽ cảm nhận được không khí ấm áp và tràn ngập hương thơm mỗi khi nến cháy.Tự thưởng bản thân mình bằng một chút
                                        ấm áp hương thơm, cạnh chương trình tivi ưa thích và chăn ấm quấn quanh, là cách tuyệt vời để tận hưởng
                                        không khí đặc biệt của mùa đông, khiến cho mùa Giáng Sinh trở nên trọn vẹn và ý nghĩa hơn bao giờ hết.< / p >
                                <p style = "margin-left:0px;" ><strong > Địa chỉ:&nbsp;</strong > 33 Hoa Sứ, phường 7, Phú Nhuận </p >
                                <p style = "margin-left:0px;" ><strong > Website:&nbsp;</strong > https://firstsight.vn/</p>
                                <p style = "margin-left:0px;" > Điện thoại:&nbsp;
                                        087 898 0099 –070 893 8782 </p >
                                <p style = "margin-left:0px;" ><
                                        img src = "https://images.twinkl.co.uk/tw1n/image/private/t_630_eco/website/uploaded/vn-11134208-7r98o-lof69m1hs69j43-1702695517.jpg"
                                        alt = "vn 11134208-7r98o-lof69m1hs69j43" width = "630" ></p >
                                <h3 style = "margin-left:0px;" ><strong > 3. Túi Gấu Thỏ Mặt Cầu - Hoa Tay Handmade</strong ></h3 >
                                <p style = "margin-left:0px;" > Chào đón không khí Noel,&nbsp;
                                        Túi Gấu Thỏ Mặt Cầu của Hoa Tay Handmade & nbsp;
                                        là một điểm nhấn độc đáo trong bộ sưu tập đồ trang trí Noel của bạn.Được tạo nên từ sự kết hợp tinh tế giữa
                                        mica hình cầu và mica trơn, chiếc túi này không chỉ là một món đồ trang trí Noel độc đáo mà còn là biểu tượng
                                        của tình yêu thủ công và sự tôn trọng đối với vật liệu tái chế.< / p >
                                <p style = "margin-left:0px;" > Sợi vải Tshirt Yarn được sử dụng khéo léo, tạo nên đường nét mềm mại và ấm áp của Gấu
                                        Thỏ, một người bạn đáng yêu và dễ thương trong không khí lễ hội.Sự chắc chắn của dây xích có khoá càng cua 2
                                        đầu và khoen D tạo nên tính thực tế, giúp chiếc túi không chỉ trang trí mà còn tiện ích trong việc sử dụng
                                        hàng ngày.</p >
                                <p style = "margin-left:0px;" > Bằng bàn tay khéo léo với kim may len nhựa và kim đánh dấu chuyên dụng, chiếc túi Gấu
                                        Thỏ Mặt Cầu không chỉ là một sản phẩm trang trí nghệ thuật mà còn là biểu tượng của sự sáng tạo và lòng
                                        nhiệt huyết thủ công.</p >
                                <p style = "margin-left:0px;" > Để làm cho chiếc túi trở nên phong cách và thu hút, không thể thiếu những chi tiết trang
                                        trí như nơ và ren vintage.Những điểm nhấn này không chỉ làm cho chiếc túi nổi bật trong không gian lễ hội mà
                                        còn tôn lên vẻ độc đáo và cá tính của nó.< / p >
                                <p style = "margin-left:0px;" > Với Túi Gấu Thỏ Mặt Cầu, không chỉ là việc trang trí noel, mà là việc tạo nên một không
                                        gian ấm áp, đẹp mắt và sáng tạo trong mỗi góc nhỏ của ngôi nhà bạn.Hãy để tác phẩm thủ công này làm cho mùa
                                        lễ hội của bạn trở nên đặc biệt và ý nghĩa hơn bao giờ hết.< / p >
                                <p style = "margin-left:0px;" ><strong > Địa chỉ:</strong > & nbsp; 2 / 21 Đường số 7, Cư Xá Đô Thành, p .4, Quận 3. </
                                        p >
                                <p style = "margin-left:0px;" ><strong > Website:</strong > & nbsp; https:
                                //hoatay.vn/</p>
                                <p style = "margin-left:0px;" > Điện thoại:&nbsp;
                                        0908187389 - 0938204488 </p >
                                <p style = "margin-left:0px;" ><
                                        img src = "https://images.twinkl.co.uk/tw1n/image/private/t_630_eco/website/uploaded/screenshot-2023-12-16-095737-1702695516.png"
                                        alt = "Screenshot 2023 12-16 095737" width = "630" ></p >
                                """)
                .build();
        var blogc1 = blogCategoryRepository.findById(1L).get();
        var blogc2 = blogCategoryRepository.findById(2L).get();
        var blogc3 = blogCategoryRepository.findById(3L).get();
        var blogc4 = blogCategoryRepository.findById(4L).get();
        blog.setCategories(List.of(blogc1,blogc2));
        blogService.save(blog);
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
