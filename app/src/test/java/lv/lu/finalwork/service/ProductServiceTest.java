package lv.lu.finalwork.service;

import lv.lu.finalwork.model.ProductInputData;
import org.junit.Test;
//import org.mockito.junit.MockitoJUnitRunner;


//@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

//    @InjectMocks
//    private ProductService victim;
//
//    @Mock
//    private ProductRepository repositoryMock;


    @Test
    public void shouldCovertAndStoreProduct() {
        ProductInputData inputData = new ProductInputData();
        inputData.setName("orange");
        inputData.setPrice(0.84);
        inputData.setCategory("FRUIT");
        inputData.setDiscount(5d);
        inputData.setDescription("Very tasty fruit");

        //       victim.save(inputData);

        //       verify(repositoryMock).save(any());
    }
}
