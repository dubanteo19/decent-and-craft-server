package com.nlu.DecentAndCraft.dataLoader;

import com.nlu.DecentAndCraft.model.Feedback;
import com.nlu.DecentAndCraft.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(6)
public class FeedbackLoader implements CommandLineRunner {
    private final FeedbackRepository feedbackRepository;

    @Value("${include-data-loader}")
    boolean includeDataLoader;

    public FeedbackLoader(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (!includeDataLoader) {
            return;
        }
        var f1 = new Feedback(null, 5, "Dư Thành Minh",
                "https://i.pravatar.cc/150?u=a042581f4e29026704d", "Facebook",
                "Tựa như bước vào một thế giới của sự dễ thương! DECENT&CRAFT thực sự là điểm đến của những sản phẩm đáng yêu và những nhân viên thân thiện. Mỗi lần ghé qua, tôi chỉ muốn mang về nhà một góc nguyên liệu xinh xắn ");
        var f2 = new Feedback(null, 5, "Liêu Thị Diễm Quỳnh",
                "https://i.pravatar.cc/150?u=a042581f4e29026204d", "Facebook",
                "Dưới ánh đèn ấm áp của DECENT&CRAFT, mỗi chi tiết đều tỏa sáng bằng vẻ đáng yêu và sự tận tâm của nhân viên. Không chỉ là nơi mua sắm, đó còn là nơi tôi cảm thấy như đang khám phá một thế giới mới, nơi mà mọi góc nhìn đều đẹp đẽ và lôi cuốn ");
        var f3 = new Feedback(null, 4, "Nguyễn Thị Chúc Ngân",
                "https://i.pravatar.cc/150?u=a042581f4e29222204d", "Zalo",
                "DECENT&CRAFT không chỉ là một cửa hàng mua sắm, mà còn là nơi tôi tìm thấy sự ấm áp và niềm vui trong việc khám phá những sản phẩm độc đáo. Sự tận tâm và chân thành của nhân viên khiến cho mỗi lần ghé qua đều  đáng nhớ");
        var f4 = new Feedback(null, 4, "Lại Thị Bích Phượng",
                "https://i.pravatar.cc/150?u=a042521f4e29222204d", "Zalo",
                "Nơi này không chỉ là một cửa hàng, mà còn là một phần của cuộc sống hàng ngày của tôi. Tôi luôn biết rằng DECENT&CRAFT sẽ mang lại cho tôi những sản phẩm chất lượng và những trải nghiệm mua sắm đáng nhớ mỗi khi tôi cần.");
        var f5 = new Feedback(null, 4, "Nguyễn Thanh Bình",
                "https://i.pravatar.cc/150?u=a04258124e29222204d", "Zalo",
                "Với sự đa dạng và chất lượng của các sản phẩm, DECENT&CRAFT không chỉ là nơi tôi mua sắm, mà còn là nguồn cảm hứng vô tận để thúc đẩy sự sáng tạo và tự do biểu đạt của bản thân");
        feedbackRepository.saveAll(List.of(f1, f2, f3, f4, f5));
    }
}
