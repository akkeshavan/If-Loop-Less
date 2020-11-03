//Run it in node 12 or above.


const cartData = [  { category: "Veggies", name: "Onions", price: 50, units: 2 } , 
                    { category: "Snacks", name: "Biscuits", price :10 , units: 5},
                    { category: "Soaps and Shampoos", name: "Soap", price :40 , units: 3},
                    { category: "Snacks", name: "Chips", price :20 , units: 2},
                    { category: "Veggies", name: "Peas", price :10 , units: 1},
                    { category:  "Veggies", name: "Spinach", price :20, units:2 },
                    { category: "Dairy", name: "Milk", price :60 , units: 2},
                    { category: "Dairy", name: "Cheese Slices", price :120, units: 1}
                ];

function groupByCategoryUsingLoops(cart) {
    let result= {};
    for(let obj of cart){
        if(!result[obj.category] ){ 
            result[obj.category]={ items:[], sub_total:0};
        }
        result[obj.category].items.push(obj);
    }
    let grand_total=0;
    for(let key in result){
        let sub_total= 0;
        let items = result[key].items;
        for(let item  of items){
            item.value = item.price * item.units;
            sub_total+=item.value;
        }
        result[key].sub_total=sub_total;
        grand_total+=sub_total
    }
    result.grand_total=grand_total
    return result;
}

function groupByCategoryUsingArrayFuncs(cart){
 
    let cartWithValues= cart.map((item)=>{ item.total_value= item.units*item.price; return item; });
    let categorized_items= getCategorizedItems(cartWithValues);
    categorized_items.grand_total= categorized_items
                                   .map(e=>e.sub_total)
                                   .reduce((p,c)=>p+c);
    return categorized_items;

}
 
function getCategorizedItems(cart){
    let categories = Array.from(new Set(cart.map((item)=>item.category)));
    return categories.map((cat) => categorize(cart,cat)); 
}

function categorize(cart,cat){
    let result={category: cat};
    result.items= cart.filter((cartItem) => cartItem.category === cat);
    result.sub_total= result.items.map(item=>item.total_value)
                        .reduce((p,c)=>p+c);
    return result;
}
function print_result(result){
    result.forEach(element=> {
        console.log(element.category);
        element.items.forEach(item=>{
            console.log("    Name:"+item.name +" Price: "+item.price + " Units: "+item.units, " Value: " + item.total_value)
        })
        console.log("Subtotal =", element.sub_total);
    });
    console.log("GRAND TOTAL = ", result.grand_total);
}

console.clear();
let groupedBy= groupByCategoryUsingArrayFuncs(cartData);
print_result(groupedBy);