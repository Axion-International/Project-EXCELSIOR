import { Injectable } from '@angular/core';
import { User } from './user.class';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  
  private modals: any[] = [];

  add(modal: any) {
      // add modal to array of active modals
      this.modals.push(modal);
  }

  remove(id: string) {
      // remove modal from array of active modals
      this.modals = this.modals.filter(x => x.id !== id);
  }

  open(id: string) {
      // open modal specified by id
      const modal = this.modals.find(x => x.id === id);
      modal.open();
  }

  close(id: string) {
      // close modal specified by id
      const modal = this.modals.find(x => x.id === id);
      modal.close();
  }
}
