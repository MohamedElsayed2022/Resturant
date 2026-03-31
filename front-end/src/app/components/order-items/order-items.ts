import { Component } from '@angular/core';
import { Order } from '../../model/order';
import { OrderService } from '../../service/order-service';

@Component({
  selector: 'app-order-items',
  imports: [],
  templateUrl: './order-items.html',
  styleUrl: './order-items.css',
})
export class OrderItems {
  orders:Order[] = [];
  constructor( private order:OrderService){}
  getOrders()  {
       this.order.getOrders().subscribe(
        data=>{
          this.orders =data
        }
       )
  }
}
