import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchSuperComponent } from './search-super.component';

describe('SearchSuperComponent', () => {
  let component: SearchSuperComponent;
  let fixture: ComponentFixture<SearchSuperComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchSuperComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchSuperComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
